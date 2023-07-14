package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		//https://github.com/shivavissu/selenium_mavenproject.git
		// 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
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
//	driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		//input[@name='username']
		//input[@id='username']
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();

	}

}
