package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

	
	ChromeDriver driver;
@BeforeSuite
public  void open(){
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrom.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		 driver =new ChromeDriver(options);
	        driver.manage().window().maximize();
	//       driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        driver.navigate().to("https://subscribe.jawwy.tv/jo-en?");
	}




@AfterSuite
public  void close()
{
//driver.quit();
}
}