package FirstPackage;
//TestClass

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FirstClass 
{
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
	
	//WebElement Menu = driver.findElement((By.xpath("//a[normalize-space()='Desktops']")));
	//WebElement MenuItem = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
	//actions.moveToElement(Menu).click();
	//actions.moveToElement(MenuItem).click();
	//actions.click(Menu);
	//actions.click(MenuItem);
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.close();
	}
}
