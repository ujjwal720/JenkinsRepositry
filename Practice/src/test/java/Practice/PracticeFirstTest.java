package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticeFirstTest {

	public WebDriver driver;

	@BeforeSuite
	public void openbrowser() {
	
		ChromeOptions options = new ChromeOptions();
	;
		// options.addArguments("--start-maximized");
		// options.addArguments("--disable-features=VizDisplayCompositor");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void navigateToGoogle() {
		driver.get("https://automationexercise.com/");
		String url=driver.getCurrentUrl();
		if (url.equals("https://automationexercise.com/")) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("welcome");
		}

		else {

			System.out.println("test is fine with headless mode");
		}
		// Add additional test steps here
	}

	@Test(priority = 2)
	public void keystobesend() {
		String url=driver.getCurrentUrl();
		try {
			if (url.equals("https://automationexercise.comrrrr/")) {
				
				
			}

			else {
				Assert.assertEquals("lom", "lome");
				
				System.out.println("test is fine with headless mode");
			}
			// Add additional test steps here
		

			} catch (Exception e) {
			
			System.out.println(e.getMessage());

		}
	}

	@Test(priority = 3)
	public void jenkinspractice() {

		System.out.println("This is of the following is an test case 3 which is now executed");
        System.out.println("hello world welcome to jungle");
	}
	
	@AfterSuite
    public void statusupdate() throws Exception 
    {
		Reporter.getCurrentTestResult();
    }

}
