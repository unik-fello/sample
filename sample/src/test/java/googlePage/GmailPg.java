package googlePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailPg
{
   @Test
   public void showPg() throws InterruptedException
   {
      System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chrom\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
      Thread.sleep(5000);
      driver.close();
   }
}
