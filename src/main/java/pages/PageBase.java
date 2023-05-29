package pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
protected WebDriver driver;
protected Actions actions;
protected JavascriptExecutor js;
protected WebDriverWait wait ;
	public PageBase(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		 js = (JavascriptExecutor) driver;
		 actions = new Actions(driver);
		// wait = new WebDriverWait(driver, 5);

	}
	public void click(WebElement element)
	{
		// actions = new Actions(driver);
		// actions.doubleClick(element).perform();
		element.click();     
		}
	public void Scroll(WebElement element)
	{
		// actions = new Actions(driver);
		// actions.doubleClick(element).perform();
		js.executeScript("arguments[0].scrollIntoView();", element);
	
	
	
	}
	public void Dclick(WebElement element)
	{
		 actions.doubleClick(element).perform();}
//		}
// 	public void wait(WebElement element)
// 	{
// 	     wait.until(ExpectedConditions .visibilityOfElementLocated(By.cssSelector("h4")));
// 		}
}
