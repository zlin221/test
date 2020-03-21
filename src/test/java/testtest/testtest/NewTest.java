package testtest.testtest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	  
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/Users/jolie/seleiumjar/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.baidu.com");
//	  Navigation navigation = driver.navigate();
//	  navigation.to("http://www.baidu.com");
	  Thread.sleep(2000);
	  driver.quit();
  }
}
