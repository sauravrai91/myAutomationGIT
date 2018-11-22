package myAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTestClass {
	
public WebDriver driver;
	 
@Test
public void openMyBlog() {
	driver.get("https://www.softwaretestingmaterial.com/");
}
	  
@BeforeClass
public void beforeClass() {
	String exePath = "D:\\Tech\\MyWorkspace\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	driver = new ChromeDriver();
}

@AfterClass
public void afterClass() {
	driver.quit();
}
	 
}
