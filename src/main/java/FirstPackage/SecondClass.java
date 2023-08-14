package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {
	
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
