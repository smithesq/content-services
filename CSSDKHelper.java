package gov.nyc.doitt.livesite.agencies.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import com.doitt.livesite.utils.LSUtils;
import com.doitt.livesite.utils.LiveSiteConstants;
import com.interwoven.cssdk.common.CSClient;
import com.interwoven.cssdk.common.CSException;
import com.interwoven.cssdk.common.CSVersion;
import com.interwoven.cssdk.factory.CSFactory;
import com.interwoven.cssdk.filesys.CSFile;
import com.interwoven.cssdk.filesys.CSSimpleFile;
import com.interwoven.cssdk.filesys.CSVPath;
import com.interwoven.livesite.runtime.LiveSiteDal;
import com.interwoven.livesite.runtime.RequestContext;
import com.interwoven.livesite.runtime.model.component.Component;
import com.interwoven.livesite.runtime.model.page.RuntimeComponent;

/**
 * CSSDK Helper class to create a component for Unit testing.
 * Also provides methods to load external properties file <base.dir>/test/test_config.properties
 * 
 * @author djung
 *
 */
public class CSSDKHelper {

	private static final transient Logger logger = Logger.getRootLogger();
	private String testDCRPath = null;
	private String testHostName = null;
	private String testAgencyString = null;
	private String testBranch = null;
	private String testPage = null;	 
	private String testAgencySite = null; //used in NYCGovContent external
	private Component testComponent = null;
	
	//NewsFilterExternal properties
	private String testStartDate = null;
	private String testEndDate = null;
	private String testCategory = null;
	private String testContentType = null;
	private String testPageNumber = null;
	private String testLanguage = null;
	
	//Controller properties
	private String testPressReleaseId = null;
	private String testPermalinkName = null;
	private String testAgencyName = null;
	private String testLSCSHost = null;
	private String testLSCSProject = null;
	private String testRequestURI = null;	
	private CSClient csclient = null;
	private static Properties testConfigProperties = new Properties();
	
	//Constructor for agency site wide controller: DynamicURLAgencySitePreController
	public CSSDKHelper(String requestURIKey, Boolean unitTesting) {
		logger.debug("key:" + requestURIKey);
		//System.exit(0);
		if (this.getCSClient() != null) {
			logger.debug("--------------UNIT TEST INFO: csclient exists:  Let's clean up first.");
			this.getCSClient().endSession();
			this.csclient = null;
		}
		this.csclient = createCSClient();	
		this.testRequestURI = (loadProperties().getProperty(requestURIKey).trim() == null)? "" : loadProperties().getProperty(requestURIKey).trim();
		logger.debug(csclient.toString());				
		logger.debug("--------------UNIT TEST INFO: Done init TestHelper");		
	}

	//Constructor for Article Details Pre Page Controller
	public CSSDKHelper(String id, String permalinkKey, String dcrKey, String agencyNameKey, String lscsHost, String lscsProject, Boolean unitTesting) {
		if (this.getCSClient() != null) {
			logger.debug("--------------UNIT TEST INFO: csclient exists:  Let's clean up first.");
			this.getCSClient().endSession();
			this.csclient = null;
		}
		CSClient csclient = createCSClient();
		logger.debug(csclient.toString());
		this.csclient = csclient;		

		this.testPressReleaseId = (loadProperties().getProperty(id).trim() == null)? "" : loadProperties().getProperty(id).trim();
		this.testPermalinkName = (loadProperties().getProperty(permalinkKey).trim() == null)? "" : loadProperties().getProperty(permalinkKey).trim();
		this.testDCRPath = (loadProperties().getProperty(dcrKey).trim() == null)? "" : loadProperties().getProperty(dcrKey).trim();
		this.testAgencyName = (loadProperties().getProperty(agencyNameKey).trim() == null)? "" : loadProperties().getProperty(agencyNameKey).trim();
		this.testLSCSHost = (loadProperties().getProperty(lscsHost).trim() == null)? "" : loadProperties().getProperty(lscsHost).trim();		
		this.testLSCSProject = (loadProperties().getProperty(lscsProject).trim() == null)? "" : loadProperties().getProperty(lscsProject).trim();
		logger.debug("--------------UNIT TEST INFO: Done init TestHelper");
	}
	
	//Constructor for NewsFilterExternal
	public CSSDKHelper(String startDateKey, String endDateKey, String categoryKey, String contentTypeKey, String pageNumberKey, String languageKey, String lscsHost, String lscsProject, Boolean unitTesting) {
		if (this.getCSClient() != null) {
			logger.debug("--------------UNIT TEST INFO: csclient exists:  Let's clean up first.");
			this.getCSClient().endSession();
			this.csclient = null;
		}
		CSClient csclient = createCSClient();
		logger.debug(csclient.toString());
		this.csclient = csclient;	
		this.testStartDate = (loadProperties().getProperty(startDateKey).trim() == null || loadProperties().getProperty(startDateKey).trim().isEmpty())? "" : loadProperties().getProperty(startDateKey).trim();
		this.testEndDate = (loadProperties().getProperty(endDateKey).trim() == null || loadProperties().getProperty(endDateKey).trim().isEmpty())? "" : loadProperties().getProperty(endDateKey).trim();
					
		this.testCategory = (loadProperties().getProperty(categoryKey).trim() == null || loadProperties().getProperty(categoryKey).trim().isEmpty())? "All" : loadProperties().getProperty(categoryKey).trim();
		this.testContentType = (loadProperties().getProperty(contentTypeKey).trim() == null || loadProperties().getProperty(contentTypeKey).trim().isEmpty())? "All" : loadProperties().getProperty(contentTypeKey).trim();
		
		this.testPageNumber = (loadProperties().getProperty(pageNumberKey).trim() == null || loadProperties().getProperty(pageNumberKey).trim().isEmpty())? "" : loadProperties().getProperty(pageNumberKey).trim();
		this.testLanguage = (loadProperties().getProperty(languageKey).trim() == null || loadProperties().getProperty(languageKey).trim().isEmpty())? "english" : loadProperties().getProperty(languageKey).trim();
		this.testLSCSHost = (loadProperties().getProperty(lscsHost).trim() == null)? "" : loadProperties().getProperty(lscsHost).trim();		
		this.testLSCSProject = (loadProperties().getProperty(lscsProject).trim() == null)? "" : loadProperties().getProperty(lscsProject).trim();		
	}
	
	//Constructor for initializing values (e.g. Article External).  No Test component needed.
	public CSSDKHelper(String dcrKey, String testBranchKey, String hostKey,  Boolean unitTesting) {
		if (this.getCSClient() != null) {
			logger.debug("--------------UNIT TEST INFO: csclient exists:  Let's clean up first.");
			this.getCSClient().endSession();
			this.csclient = null;
		}
		CSClient csclient = createCSClient();
		logger.debug(csclient.toString());
		this.csclient = csclient;		
		
		this.testDCRPath = (loadProperties().getProperty(dcrKey).trim() == null)? "" : loadProperties().getProperty(dcrKey).trim();
		this.testHostName = (loadProperties().getProperty(hostKey).trim() == null)? "" : loadProperties().getProperty(hostKey).trim();
		this.testBranch = (loadProperties().getProperty(testBranchKey).trim() == null)? "" : loadProperties().getProperty(testBranchKey).trim();
		this.testAgencyString = Pattern.compile("^/production/main/NYC_gov_new/(.*)?/WORKAREA/content/$").matcher(this.testBranch).replaceAll("$1");			
		logger.debug("--------------UNIT TEST INFO: Done init TestHelper");
	}
	
	//Constructor to support content types that can have variant sub types.  e.g. Programs can support nycgov/agency, can be listing page, or featured or 4/8 component.	
	public CSSDKHelper(String pageKey, String componentKey, Boolean unitTesting) {
		logger.debug("key:" + componentKey);
		//System.exit(0);
		if (this.getCSClient() != null) {
			logger.debug("--------------UNIT TEST INFO: csclient exists:  Let's clean up first.");
			this.getCSClient().endSession();
			this.csclient = null;
		}
		this.csclient = createCSClient();		
		logger.debug(csclient.toString());		
		if (componentKey != null) {
			this.testComponent = createTestComponent(pageKey, componentKey);
			if (this.testComponent == null) {
				logger.error("Failed create test component");
				System.exit(-1);
			}
		}		
		logger.debug("--------------UNIT TEST INFO: Done init TestHelper");		
	}
	
	public CSSDKHelper() {		
	}
	
	/**
	 * When this class is instantiated via 2 argument constructor, create appropriate test component.  
	 * Set as a property in this class.
	 * Passed as parmaeter to class under test.
	 * 
	 * @param pagePropKey
	 * @param compPropKey
	 * @return
	 */
	public Component createTestComponent(String pagePropKey, String compPropKey){
					
		String testPage = (loadProperties().getProperty(pagePropKey).trim() == null)? "" : loadProperties().getProperty(pagePropKey).trim();				
		//NycgovContent property
		this.testAgencySite = Pattern.compile("^/production/main/NYC_gov_new/(.*)/WORKAREA.*").matcher(testPage).replaceAll("$1");			
							
		if (testPage.isEmpty()) {
			logger.error("\n --------------UNIT TEST ERROR: Please define all test properties in test_config.properties");
			return null;
		}		 		
		//logger.debug("\n --------------UNIT TEST INFO: Test Environment: " + tsHost);
		logger.debug("\n --------------UNIT TEST INFO: Test page: " + testPage);
		this.testBranch = deriveTestBranch(testPage);
		logger.debug("\n --------------UNIT TEST INFO: Test branch: " + testBranch);	
		
		String testComponent = null;
		try {
			testComponent = (loadProperties().getProperty(compPropKey).trim() == null)? "" : loadProperties().getProperty(compPropKey).trim();
		} catch (NullPointerException npe) {
			logger.error("Failed to load component property key:" + compPropKey);
			return null;
		}
		
		Document page = readXMLFile(this.csclient, testPage);
		//Use page containing component.  Since component with dcr datum does not have dcrs selected till runtime, the page will have selected dcrs and will be representative test.
		//Element baseComponentElement = (Element) page.selectSingleNode("//BaseComponent[text()[contains(.,'doitt/agencies/index/Home Body.component')]]"); //Path to the actual component.  possible candidate to externalize if want to test different components on same page.
		String xpathQuery = "//BaseComponent[text()[contains(.,'" + testComponent.trim() + "')]]";		
		logger.debug("Xpath query:" + xpathQuery);
		Element baseComponentElement = (Element) page.selectSingleNode(xpathQuery); //Path to the actual component.  possible candidate to externalize if want to test different components on same page.
		if (baseComponentElement == null) {
			//logger.error("Page " + testPage + " does not contain component in config.  Can't run unit test.");
			logger.error("\n --------------UNIT TEST ERROR: Page " + testPage + " does not contain component in config.  Can't run unit test.");
			return null;
		}
		// get component root
		Element compRoot = baseComponentElement.getParent(); 
		//Create the component
		Boolean admin = true;
		RuntimeComponent rtc = new RuntimeComponent(compRoot, admin);		
		logger.debug("--------------UNIT TEST INFO: Created component: " + rtc.toString());		
		return rtc;					
	}
	
	/**
	 * Based on page in test_config.properties, can derive the test branch used by lsdalWrapper
	 * @param testPage
	 * @return
	 */ 
	public String deriveTestBranch(String testPage) {
		return Pattern.compile("^(.*/WORKAREA/content/)(.*)$").matcher(testPage).replaceAll("$1");		
	}
	
	public String getTestStartDate() {
		return this.testStartDate;
	}
	
	public String getTestEndDate() {
		return this.testEndDate;
	}
	
	public String getTestCategory() {
		return this.testCategory;
	}
	
	public String getTestContentType() {
		return this.testContentType;
	}
	
	public String getTestPageNumber() {
		return this.testPageNumber;
	}
	
	public String getTestLanguage() {
		return this.testLanguage;
	}
	
	public String getTestRequestURI() {
		return this.testRequestURI;
	}
	
	public String getTestPermalinkName() {
		return this.testPermalinkName;
	}
	
	public String getTestLSCSHost() {
		return this.testLSCSHost;
	}
	
	public String getTestLSCSProject() {
		return this.testLSCSProject;
	}
	
	public String getTestPressReleaseId() {
		return this.testPressReleaseId;
	}
	
	public String getTestAgencyName() {
		return this.testAgencyName;
	}
	
	public String getTestDCRPath() {
		return this.testDCRPath;
	}
	
	public String getTestHostName() {
		return this.testHostName;
	}
	
	public String getTestAgencyString() {
		return this.testAgencyString;
	}
	
	public String getTestAgencySite() {
		return this.testAgencySite;
	}
	
	public String getTestPage() {
		return this.testPage;
	}
	
	public Component getTestComponent() {
		return this.testComponent;
	}
	
	public String getTestBranch() {
		return this.testBranch;
	}
	
	public CSClient getCSClient() {
		return this.csclient;
	}
	
	public static CSClient createCSClient () {	
		//logger.debug("--------------UNIT TEST INFO: in create client");
		Properties properties = new Properties();		
		String host  = (loadProperties().getProperty("test.teamsitehost") == null)? "" : loadProperties().getProperty("test.teamsitehost");			
		String username = (loadProperties().getProperty("test.cssdkuser") == null)? "" : loadProperties().getProperty("test.cssdkuser");
		String password = (loadProperties().getProperty("test.cssdkpassword") == null)? "" : loadProperties().getProperty("test.cssdkpassword");
		
		if (host.isEmpty() || username.isEmpty() || password.isEmpty()) {
			logger.error("\n --------------UNIT TEST ERROR: Please define all test properties in test_config.properties");
			return null;
		}		
		properties.setProperty("com.interwoven.cssdk.factory.CSFactory",	"com.interwoven.cssdk.factory.CSJavaFactory");	   
		properties.setProperty("defaultTSServer", host);	
		properties.setProperty("ts.server.os", "lin");		

		CSFactory factory = CSFactory.getFactory( properties );
		CSClient client = null;
		// using JAVA factory		   
		try
		{
			// Print the CSSDK Server & Client versions.
			CSVersion version = null;			
			// Construct the CSClient object.
			client = factory.getClient(
					username,		 		// UserName 
					"", 		 			// Roles: No-Op
					password,				// Password
					Locale.getDefault(), 	// Locale
					"UnitTest", 				// Application Context
					null );					// TeamSite HostName [ will be read from properties object ]
			

			logger.debug("\n--------------UNIT TEST INFO: Got Content Services Client for: " + client.getCurrentUser().getName());
			return client;				
		}
		catch( CSException cse ) {
			logger.debug("CSException occured while retrieving CSClient object!");
			cse.printStackTrace();
			return client;
		} catch( Exception e ) {
			logger.debug("Exception occured while retrieving CSClient object!");
			e.printStackTrace();
			return client;
		}		
	}
	
	public Document readXMLFile (CSClient csclient, String path) {	
		Document doc = null;
		try {
			// create csfile - can be any xml file
			CSFile xmlFile = csclient.getFile(new CSVPath(path));
			CSSimpleFile xml = (CSSimpleFile) xmlFile;
			
			logger.debug(path);
			// Converting xml to inputStream
			InputStream is = xml.getInputStream(true);
			String xmlContent = LSUtils.inputStreamToString(is, LiveSiteConstants.ENCODING);		
			// now convert inputStream to doc			
			try {
				doc = LSUtils.stringToXMLDocument(xmlContent);
			} catch (DocumentException de) {
				de.printStackTrace();
			}			
			return doc;
		} catch (CSException cse) {			
			cse.printStackTrace();
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
			return doc;
		}
	}
	
	// version 2: resources/config.properties.  consolidate properties loader
	public static Properties loadProperties(){
		// Load properties if properties table is empty
		//testConfigProperties = new Properties();
		if(testConfigProperties.isEmpty()){	

			Properties prop = new Properties();
			InputStream in = null;
			in = CSSDKHelper.class.getClassLoader().getResourceAsStream("config.properties");
						
			//try {				
				//try read resource relatively.
				//File initialFile = new File("src/test/test_config.properties");
			    //try {
					//in = FileUtils.openInputStream(initialFile);
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//logger.debug(in);				
			//} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}			
			
			try {
				testConfigProperties.load(in);
				in.close();
			} catch (IOException ioe) {
				logger.error("Failed loading properties from config file.", ioe);
			}	
			logger.debug("Number of properties loaded: " + testConfigProperties.size());
			// Retrieve a property
			for (Object key : testConfigProperties.keySet()){
				logger.debug(key + " - " + testConfigProperties.getProperty((String) key));
			}	
			//System.exit(-1);
		}
		return testConfigProperties;
	}
	
	/**
	 * A wrapper to lsdal.  The testBranch is computed from test page property. Then the full path to xml is used by custom cssdk method to return same doc as lsdal would.  
	 * This is so unit test can invoke a version of lsdal without throwing NPE.
	 * @param context
	 * @param relPath
	 * @return
	 * @throws DocumentException
	 */
	public Document lsdalWrapper (RequestContext context, String relPath, String testBranch) throws DocumentException{
		Document document = null;
		try {
			LiveSiteDal lsdal = context.getLiveSiteDal();
			document = lsdal.readXmlFile(relPath);			
		} catch (NullPointerException npe) { //External invoked as POJO unit test
			// lsdal npe when invoked as unit test.  Simulate lsdal via cssdk						
			document = readXMLFile(this.getCSClient(), testBranch + relPath);			
		}
		return document;
	}	
}