package testcases;



import java.util.Random;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import java.util.Random;

import pages.Cart;
import pages.Home;
import pages.Cart;
import pages.Home;

@Test
public class checkPS extends TestBase{

Home home ;

Cart cart;
	public void CheckAE() throws InterruptedException
	{
         	home =new Home(driver) ;
            home.SelectCounty("PS");
            home.CheckTypes();
            home.Checkcurrency("2.4 USD/month","4.8 USD/month","7.2 USD/month");

	}
}
