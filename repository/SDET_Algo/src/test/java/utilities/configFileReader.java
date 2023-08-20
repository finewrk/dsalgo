package utilities;

import java.io.FileInputStream;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class configFileReader {
	
	public static Properties properties;
	//System.setProperty(""webdriver.chrome.driver","C:\Users\limna\eclipse-workspace\DummyDsalgo\src\test\resources\drivers\chromedriver.exe");"
		//System.setProperty("webdriver.chrome.driver","C:\Users\limna\eclipse-workspace\DummyDsalgo\src\test\resources\drivers\chromedriver.exe");
	public static final String propertyFilePath = "./src/test/resources/config/config.properties";
	public static WebDriver driver;
	public static String browserType = null;
	
	public static void readConfig() throws Throwable {
		
		FileInputStream fis;
		fis = new FileInputStream(propertyFilePath);
		properties = new Properties();
		properties.load(fis);
		fis.close();
		
	}
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		if(browser != null) {
			return browser;
		}
		else {
			throw new RuntimeException("browser not specified in config.properties file");
		}
	}
	
	public static String getUrl() {
		String url = properties.getProperty("url");
		if(url != null) {
			return url;
		}else {
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		}
	}
	
	public static String getHomePage() {
		String homeurl = properties.getProperty("HomeUrl");
				
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not specified in the Configuration.properties file.");
	}
	public static String getRegisterPage() {
		String registerurl = properties.getProperty("Registerurl");
				
		if (registerurl != null)
			return registerurl;
		else
			throw new RuntimeException("Registerurl not specified in the Configuration.properties file.");
	}
	public static String getSigninPage() {
		String signinurl = properties.getProperty("Login");
				
		if (signinurl != null)
			return signinurl;
		else
			throw new RuntimeException("Login not specified in the Configuration.properties file.");
	}
	
	public static String getExcelPath() {
		String excelPath = properties.getProperty("excelpath");
				
		if (excelPath != null)
			return excelPath;
		else
			throw new RuntimeException("Excel Path is not specified in the Configuration.properties file.");
	}
	public static String DataStructuresIntroduction() {
		String DataStructuresIntroduction = properties.getProperty("DataStructuresIntroduction");
		
		if (DataStructuresIntroduction != null)
			return DataStructuresIntroduction;
		else
			throw new RuntimeException("DataStructuresIntroduction not specified in the Configuration.properties file.");
	}
	public static String TimeComplexity() {
		String TimeComplexity = properties.getProperty("TimeComplexity");
		
		if (TimeComplexity != null)
			return TimeComplexity;
		else
			throw new RuntimeException("TimeComplexity url not specified in the Configuration.properties file.");
	}

	public static String tryEditorURL() {
		String tryeditorurl = properties.getProperty("Tryeditorurl");
		if (tryeditorurl != null)
			return tryeditorurl;
		else
			throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
	}

	public static String getArrayURL() {
		String ArraypageURL = properties.getProperty("ArraypageURL");
		if (ArraypageURL != null)
			return ArraypageURL;
		else
			throw new RuntimeException("ArraypageURL not specified in the Configuration.properties file.");
	}

	public static String getArrayInPythonURL() {
		String ArraysinPythonpage = properties.getProperty("ArraysinPythonpage");
		if (ArraysinPythonpage != null)
			return ArraysinPythonpage;
		else
			throw new RuntimeException("ArraysinPythonpage not specified in the Configuration.properties file.");
	}

	public static String getArraysUsingListURL() {
		
		String ArraysUsingList = properties.getProperty("ArraysUsingList");
		if (ArraysUsingList != null)
			return ArraysUsingList;
		else
			throw new RuntimeException("ArraysUsingList not specified in the Configuration.properties file.");
	}

	public static String getBasicOperationsURL() {
		
		String BasicOperationsinLists = properties.getProperty("BasicOperationsinLists");
		if (BasicOperationsinLists != null)
			return BasicOperationsinLists;
		else
			throw new RuntimeException("BasicOperationsinLists not specified in the Configuration.properties file.");
	}

	public static String getApplicationofArray() {
		String ApplicationsofArray = properties.getProperty("ApplicationsofArray");
		if (ApplicationsofArray != null)
			return ApplicationsofArray;
		else
			throw new RuntimeException("ApplicationsofArray not specified in the Configuration.properties file.");
	}

	public static String getpracticeQuesURL() {
		String PracticeQuesURl = properties.getProperty("PracticeQuesURl");
		if (PracticeQuesURl != null)
			return PracticeQuesURl;
		else
			throw new RuntimeException("PracticeQuesURl not specified in the Configuration.properties file.");
		
	}

	public static String getnaviQuestionOneURL() {
		String QuestionSearchthearray = properties.getProperty("QuestionSearchthearray");
		if (QuestionSearchthearray != null)
			return QuestionSearchthearray;
		else
			throw new RuntimeException("QuestionSearchthearray not specified in the Configuration.properties file.");
	}

	public static String getLinkedListURL() {
		String linkedlisturl = properties.getProperty("linkedlisturl");
		if (linkedlisturl != null)
			return linkedlisturl;
		else
			throw new RuntimeException("linkedlisturl not specified in the Configuration.properties file.");
	}
	
	public static String getStackURL() {
		String Stackpage = properties.getProperty("Stackpage");
		if (Stackpage != null)
			return Stackpage;
		else
			throw new RuntimeException("Stackpage not specified in the Configuration.properties file.");
	}
	//queueurl
	public static String getqueueurl() {
		String queueurl = properties.getProperty("queueurl");
		if (queueurl != null)
			return queueurl;
		else
			throw new RuntimeException("queueurl not specified in the Configuration.properties file.");
	}

	public static String getTreeURL() {
		String treeurl = properties.getProperty("treeurl");
		if (treeurl != null)
			return treeurl;
		else
			throw new RuntimeException("treeurl not specified in the Configuration.properties file.");
	}
}

	

