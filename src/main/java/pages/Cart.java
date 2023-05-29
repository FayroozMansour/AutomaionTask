package pages;

import org.openqa.selenium.WebDriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Cart extends PageBase {

	public Cart(WebDriver driver) {
		
		super(driver);
		 actions = new Actions(driver);
	}

	@FindBy(id = "card_holder_name")
	WebElement cardholdername;

	@FindBy(id = "card_number")
	WebElement cardnumber ;

	@FindBy(id = "expiry_month")
	WebElement expiry_month;


	@FindBy(id = "expiry_year")
	WebElement expiry_year ;


	@FindBy(id = "card_security_code") 
	WebElement cardsecuritycode;


	@FindBy(xpath = "//*[contains(text(),'Submit')]") 
	WebElement Submit;

public void Pay() throws InterruptedException
{
    Thread.sleep(1000);
	cardholdername.sendKeys("test");
    Thread.sleep(1000);
	cardnumber.sendKeys("1234123412341234");
	expiry_month.sendKeys("12");
	expiry_year.sendKeys("2025");
	cardsecuritycode.sendKeys("111");
   
}

}
