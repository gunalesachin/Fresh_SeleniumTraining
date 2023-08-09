package FirstPackage;
//TestClass

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass 
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	}
}
