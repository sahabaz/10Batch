package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public static RemoteWebDriver d;
	
	public BasePage(RemoteWebDriver d) 
	{
		this.d=d;
	}
	
	public static void pageVerify(String title)
	{
		WebDriverWait wait = new WebDriverWait(d, 10);
		try 
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching" , true);
		} 
		catch (Exception e) 
		{
			Reporter.log("Title is not matching" , true);
		}
	}
	
	public static void eleverify(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(d, 10);
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is visible" , true);
		} 
		catch (Exception e) 
		{
			Reporter.log("Element is not visible" , true);
		}
	}
}
