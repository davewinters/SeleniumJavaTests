import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSeleniumTest {
    public static void main(String[] args) { // TODO Auto-generated method stub 
  System.setProperty("webdriver.chrome.driver", "/home/david/Downloads/selenium/chromedriver"); 
  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
  driver.get("https://www.linkedin.com/login"); 
  //WebElement username=driver.findElement(By.id("username")); 
  //WebElement password=driver.findElement(By.id("password")); 
  //WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
  //username.sendKeys("example@gmail.com"); password.sendKeys("password"); 
  //login.click(); String actualUrl="https://www.linkedin.com/feed/"; 
 // String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
  System.out.println("Basic Test passed");  }   }