package FirstPackage;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alerts_Class {
	private static final String FileUtils = null;

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.seleniumeasy.com/");
	//Select Advance = new Select(driver.findElement((By.id("details-button"))));
	//driver.findElement(By.id("details-button")).click();
	//driver.findElement(By.id("proceed-link")).click();
	//driver.findElement(By.xpath("\\div[@class=\"avbar-brand navbar-brand-centered\"]/a"));
	//driver.findElement((By.xpath("//a[normalize-space()='Desktops']"))).click();
	//driver.findElement(By.xpath("//a[normalize-space()='PC (0)']")).click();
	//driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks (5)']")).click();
	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Alerts & Modals']")).click();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[normalize-space()='Javascript Alerts']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Alert Prompt = driver.switchTo().alert();
	String strAlert = Prompt.getText();
	System.out.println("Prompt Text is :- "+strAlert);
	Prompt.sendKeys(strAlert);
	
	// //i[@class='fas fa-search'] - search button
	// //input[@placeholder='Search']
	}
}
