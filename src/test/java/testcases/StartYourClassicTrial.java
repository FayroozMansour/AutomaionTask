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
public class StartYourClassicTrial  extends TestBase{
Home home ;

Cart cart;
	public void StartYourTrial() throws InterruptedException
	{
         	home =new Home(driver) ;
        	Random random = new Random();
            String username="Fayrooz"+random.nextInt(1000)+"@gmaill.com";
            home.classicselection();
	        home.StartYourTrial(username,"Test1234");
	     
	        cart =new Cart(driver) ;
		    cart.Pay();

	}
}
