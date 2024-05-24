package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/frame");
		
		List<WebElement>frameCount= driver.findElements(By.tagName("iframe"));
		int size=frameCount.size();
		System.out.println(size);
	
		driver.switchTo().frame("firstFr");
		
		WebElement firstName= driver.findElement(By.name("fname"));
		firstName.sendKeys("Angel");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("Email");
		
		driver.switchTo().defaultContent();

	}

}
