package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		String strlbl= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println("Label name" + strlbl);
		//Mainpage to frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");
		//frame1 to frame3
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		//frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" Welcome Back");
		//frame1 to mainpage
		driver.switchTo().defaultContent();
		//mainpage to frame2
		System.out.println("driver.findElement(By.xpath(\"//label/span)).getText()");
	}

}
