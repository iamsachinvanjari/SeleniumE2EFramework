package TestPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg2 {
	 public static WebDriver driver;

	@Test
	public static void m1() {
	//public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "//Users//sachin.vanjari//Downloads//selenium//chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Chrome session started.");
		String title=driver.getTitle();
		System.out.println(title);
		driver.get("https://www.guru99.com/");
		String title1=driver.getTitle();
		System.out.println(title1);

		driver.navigate().back();
		String back=driver.getTitle();
		System.out.println(back);
		
		driver.navigate().forward();
		String frwd=driver.getTitle();
		System.out.println(frwd);
		System.out.println("Chrome session ended.");
		driver.quit(); // closes all the browsers by webdriver
	}
	@Test
	public void m2() {
		System.out.println("inside m1 method.");
	}
}
