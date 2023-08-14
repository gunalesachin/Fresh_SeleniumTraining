package FirstPackage;
//TestClass

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FirstClass 
{
	private static final String FileUtils = null;

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.opencart.com");
	
	//Select Advance = new Select(driver.findElement((By.id("details-button"))));
	//driver.findElement(By.id("details-button")).click();
	//driver.findElement(By.id("proceed-link")).click();
	//driver.findElement(By.xpath("\\div[@class=\"avbar-brand navbar-brand-centered\"]/a"));
	driver.findElement((By.xpath("//a[normalize-space()='Desktops']"))).click();
	driver.findElement(By.xpath("//a[normalize-space()='PC (0)']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks (5)']")).click();
	
	TakesScreenshot screen = (TakesScreenshot)driver;
	File srcFile = screen.getScreenshotAs(OutputType.FILE);
	srcFile(srcFile, new File("C:\\SeleniumProject\\Fresh_SeleniumTraining\\ScreenShots\\FirstScreen.gif"));
	
	// //i[@class='fas fa-search'] - search button
	// //input[@placeholder='Search']
	
	//WebElement Menu = driver.findElement((By.xpath("//a[normalize-space()='Desktops']")));
	//WebElement MenuItem = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
	//actions.moveToElement(Menu).click();
	//actions.moveToElement(MenuItem).click();
	//actions.click(Menu);
	//actions.click(MenuItem);
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.close();
	
	class ShadowDomTest
	{
		void main(String[] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.get("http://watir.com/examples/shadow_dom.html");
			WebElement shadowHost = driver.findElement(
					By.cssSelector("shadow_host"));
			SearchContext shadowRoot = shadowHost.getShadowRoot();
			String strTxt = shadowRoot.findElement(By.cssSelector("#shadow_content")).getText();
			System.out.println("Text from ShadowDom..." +strTxt);
		}
		
	}
		
	
	}

	private static void srcFile(File srcFile, File file) {
		// TODO Auto-generated method stub
		
	}
}
