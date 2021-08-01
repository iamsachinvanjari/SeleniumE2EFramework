package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orchard {
	public static WebDriver driver;

	@Test
	public static void m1() {
		 WebDriverManager.chromedriver().setup();
			//	System.setProperty("webdriver.chrome.driver", "//Users//sachin.vanjari//Downloads//selenium//chromedriver");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.get("https://orchard.appdirect.tools/login");
					driver.manage().window().maximize();
					String title=driver.getTitle();
					System.out.println("chrome session started.");
					System.out.println(title);
					driver.findElement(By.xpath("//a[normalize-space()='Connect with OpenID']")).click();
					driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sachin.vanjari@appdirect.com");
					driver.findElement(By.xpath("//*[@id='main']/div/div[1]/form/div[2]/div/div[2]/div/div[1]/div/button")).click();
					driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("SV$mar@202106");
					driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
			//		driver.findElement(By.xpath("//a[normalize-space()='Connect with OpenID']")).click();
			//		driver.findElement(By.xpath("//a[normalize-space()='Connect with OpenID']")).click();
					
	}

}
