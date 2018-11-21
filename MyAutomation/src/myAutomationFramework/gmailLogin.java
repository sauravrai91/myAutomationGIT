package myAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

	public static void main(String[] args) {
		
		 String exePath = "D:\\Tech\\MyWorkspace\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		 System.out.print("Hello There What's Up");
		 }	
	
}
