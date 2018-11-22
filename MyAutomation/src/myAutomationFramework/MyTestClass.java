package myAutomationFramework;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
 
public class MyTestClass {
 
 public WebDriver driver;
 
  @Test
 
  public void main() {
      driver.findElement(By.id("account")).click();
      driver.findElement(By.id("log")).sendKeys("testuser_1");
      driver.findElement(By.id("pwd")).sendKeys("Test@123");
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.id("account_logout"));
  }
 
  @BeforeMethod
  public void beforeMethod() {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://www.onlinestore.toolsqa.wpengine.com");
  }
 
  @AfterMethod
  public void afterMethod() {
      driver.quit();
  }
}