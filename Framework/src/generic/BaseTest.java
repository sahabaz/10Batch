package generic;

import java.io.IOException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import net.sf.cglib.core.RejectModifierPredicate;

public abstract class BaseTest implements AutoConst
{
	
	public static RemoteWebDriver d;
	
	@Parameters({"browser" , "nodeurl"})
	@BeforeMethod
	public void preCondition(String browser , String nodeurl) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
//		System.setProperty(CHROME_KEY, CHROME_VALUE);
//		d = new ChromeDriver();
//		d.get(Excel.readData("Sheet1", 0, 1));
		URL url = new URL(nodeurl);
		DesiredCapabilities dr = new DesiredCapabilities();
		dr.setBrowserName(browser);
		d = new RemoteWebDriver(url, dr);
		d.get(Excel.readData("Sheet1", 0, 1));
	}
	
	@AfterMethod
	public void postCondition()
	{
		d.close();
	}
}
