package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericUtils 
{
	public static void selectByText(WebElement element ,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void selectByindex(WebElement element ,int n)
	{
		Select s = new Select(element);
		s.selectByIndex(n);
	}
	
	public static void mouseAction(WebElement target)
	{
		Actions a = new Actions(BaseTest.d);
		a.moveToElement(target).perform();
	}
	
	public static void scroll(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) BaseTest.d;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}
	
}
