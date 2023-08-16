package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesClass 
{
public static void main (String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	WebElement strlb1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame("frame1");
	strlb1.getText();
	System.out.println("Frame Name is :"+strlb1);
	strlb1.clear();
	strlb1.click();
	WebElement TextBox = driver.findElement(By.xpath("//input[@type='text']"));
	TextBox.sendKeys("Welcome, Clicking on Frame 1");
	
	
	WebElement strlb2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	strlb2.getText();
	System.out.println("Frame Name is :"+strlb2);
	strlb2.click();
	WebElement ComboBox = driver.findElement(By.xpath("//select[@id='animals']"));
	ComboBox.click();
			
	
	
	}
}
