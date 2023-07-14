package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowhost= driver.findElement(By.id("shadow_host"));
		SearchContext context= shadowhost.getShadowRoot();
		WebElement shadowcontent= context.findElement(By.cssSelector("#shadow_content"));
		
		
		System.out.println("Text from shadowDOM"  + shadowcontent.getText());
	}
}
