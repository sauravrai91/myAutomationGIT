package myAutomationFramework;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
 
public class MyTestClass {
 
 public WebDriver driver;
 
  @Test
 
  public void main() {
      driver.findElement(By.id("account")).click();
      driver.findElement(By.id("log")).sendKeys("saurav");
      driver.findElement(By.id("pwd")).sendKeys("hS&&EaBE1^3hB2j6");
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.id("account_logout")).click();
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Tech\\MyWorkspace\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://www.store.demoqa.com");
  }
 
  @AfterMethod
  public void afterMethod() {
      driver.quit();
  }
}