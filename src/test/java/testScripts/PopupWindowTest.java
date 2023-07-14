package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class PopupWindowTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parenthandle = driver.getWindowHandle();
		System.out.println("ParentHandle" + parenthandle);
		driver.findElement(By.xpath("//button[@class='btn btn-info'][1]")).click();
		Set<String> tabs=driver.getWindowHandles();
		System.out.println("No of windows:" + tabs.size());
		for(String child:tabs) {
			System.out.println(child);
			if (!child.equalsIgnoreCase(parenthandle)) {
				driver.switchTo().window(child);
		//	Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='menu-text'[2]"));
		}
		}
		driver.close();	
		driver.switchTo().window(parenthandle);
	//	driver.findElement(By.xpath("//button[contains(text(),'new Window')]";
	//	driver.switchTo().newWindow(WindowType.TAB);
	//	driver.navigate().to("https://www.selenium.dev/");
		//driver.quit();
		
		}
		
		
	}


