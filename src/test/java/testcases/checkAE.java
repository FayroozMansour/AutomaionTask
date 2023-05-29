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
public class checkAE extends TestBase{

Home home ;

Cart cart;
	public void CheckAE() throws InterruptedException
	{
         	home =new Home(driver) ;
            home.SelectCounty("AE");
            home.CheckTypes();
            home.Checkcurrency("5.4 USD/month","10.9 USD/month","16.3 USD/month");

	}
}
