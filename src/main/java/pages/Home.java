package pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.annotations.VisibleForTesting;

import dev.failsafe.internal.util.Assert;
import static org.testng.Assert.assertFalse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Home extends PageBase {



	public Home(WebDriver driver) {
		super(driver);
	
	}
@FindBy(xpath =  "//*[@id=\"classic-selection\"]")
WebElement classicselection ;

@FindBy(id =  "premium-selection")
WebElement premiumselection ;

@FindBy(id =  "lite-selection")
WebElement liteselection ;

@FindBy(xpath =  "//*[@id=\"copyrightText\"]/a")
WebElement copyrightText;

@FindBy(xpath = "//div[@class=\"summary-group\"]/button[contains(text(),'Next')][1]")
 WebElement Next;

@FindBy(id = "readonlyEmail")
WebElement email;


@FindBy(id = "readonlyPassword")
WebElement password ;

@FindBy(id = "currency-lite")
WebElement currencylite;
@FindBy(id = "currency-classic")
WebElement currencyclassic;
@FindBy(id = "currency-premium")
WebElement currencypremium;

@FindBy(className = "country-current")
WebElement countrycurrent;

@FindBy(id = "ae-contry-lable")
WebElement AE;
@FindBy(id = "lb")
WebElement lb;
@FindBy(id = "ps")
WebElement ps;

@FindBy(id = "name-lite")
WebElement lite;
@FindBy(id = "name-classic")
WebElement classic;
@FindBy(id = "name-premium")
WebElement premium;


//*[@id="name-lite"]

public void classicselection() throws InterruptedException 
{  
    Thread.sleep(1000);
    Scroll(classicselection);
    Thread.sleep(1000);
    classicselection.click();

}
public void liteselection() throws InterruptedException 
{  
	 Thread.sleep(1000);
	    Scroll(liteselection);
	    Thread.sleep(1000);
	    liteselection.click();
}
public void premiumselection()  throws InterruptedException 
{   Thread.sleep(1000);
Scroll(premiumselection);
Thread.sleep(1000);
premiumselection.click();

}
public void StartYourTrial(String Username,String Password) throws InterruptedException 
{
  //  Thread.sleep(1000);
    Thread.sleep(1000);
    Scroll(copyrightText);

    Next.isDisplayed();
    Dclick(Next);
    Next.click();
    Thread.sleep(1000);
    Next.click();
    
    email.sendKeys(Username);
    password.sendKeys(Password);
    Next.click();

}
public void CheckTypes2(String contry) throws InterruptedException 
{
	

    Thread.sleep(100);
    countrycurrent.click();
    AE.click();
    Scroll(currencylite);
    currencylite.isDisplayed();
    currencyclassic.isDisplayed();
    currencypremium.isDisplayed();
    lite.isDisplayed();
    classic.isDisplayed();
    premium.isDisplayed();

    
    
}

public void SelectCounty(String contry) throws InterruptedException 
{
	
	if (contry=="AE")
	{ Thread.sleep(100);
	    countrycurrent.click();
	    AE.click();
	    Scroll(currencylite);

	}

	if (contry=="LB")
	{ Thread.sleep(100);
	    countrycurrent.click();
	    lb.click();
	    Scroll(currencylite);

	}
	

	if (contry=="PS")
	{ Thread.sleep(100);
	    countrycurrent.click();
	    ps.click();
	    Scroll(currencylite);

	}
	
	
	
}


@VisibleForTesting
public void CheckTypes() throws InterruptedException 
{
	

 //   Thread.sleep(100);
 //   countrycurrent.click();
 //   AE.click();
 //   Scroll(currencylite);


String litetext=lite.getText();
String classictext=classic.getText();
String premiumtext=premium.getText();

org.testng.Assert.assertEquals(litetext, "LITE");
org.testng.Assert.assertEquals(classictext, "CLASSIC");
org.testng.Assert.assertEquals(premiumtext, "PREMIUM");

    
}
public void Checkcurrency(String lite ,String classic  ,String  premium)
{
String currencylitetext=currencylite.getText();
String currencyclassictext=currencyclassic.getText();
String currencypremiumvalue=currencypremium.getText();

org.testng.Assert.assertEquals(currencylitetext, lite);
org.testng.Assert.assertEquals(currencyclassictext, classic);
org.testng.Assert.assertEquals(currencypremiumvalue, premium);


}

}