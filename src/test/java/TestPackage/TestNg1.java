package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg1 {
	 public static WebDriver driver;
	 ExtentReports extent;
	 @BeforeTest
	 public void config() {
		 // ExtentReports 	ExtentSparkReporter
		 String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter est= new ExtentSparkReporter(path);
		est.config().setReportName("sachin");
		est.config().setDocumentTitle("Extent report Practical");
		
		extent= new ExtentReports();
		extent.attachReporter(est);
		extent.setSystemInfo("QA", "Sachin");
		 
	 }

	@Test
	public void m1() {
		extent.createTest("initial test");
		
		WebDriverManager.firefoxdriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "//Users//sachin.vanjari//Downloads//selenium//chromedriver");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Firefox session started.");
		System.out.println(title);
//		driver.get("https://www.guru99.com/");
//		String title1=driver.getTitle();
//		System.out.println(title1);

//		driver.navigate().back();
//		String back=driver.getTitle();
//		System.out.println(back);
		
//		driver.navigate().forward();
//		String frwd=driver.getTitle();
//		System.out.println(frwd);
		System.out.println("Firefox session ended.");
		driver.quit(); // closes all the browsers by webdriver
		extent.flush();
	}
	@Test
	public void m2() {
		System.out.println("inside m1 method.");
	}
	
	@Test
	public void m3() {
		System.out.println("inside m1 method.");
	}
}
