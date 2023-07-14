package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");
		WebElement srchbox=	driver.findElement(By.name("search"));
		srchbox.sendKeys("phone");
		//Fullpage screenshot
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File scr=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\Screenshot\\FulScreen.png"));
		//Element screenshot
		
		WebElement img=driver.findElement(By.xpath("//button[@data-bs-original-title='Add to Cart']"));
		File  imsrc =img.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\Screenshot\\ImageScreen.png"));
		
			
			
	}

}
