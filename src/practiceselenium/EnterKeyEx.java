package practiceselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnterKeyEx {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		//driver.manage().window().maximize();
//		Dimension dimension=new Dimension(1366,768);
//		driver.manage().window().setSize(dimension);
//		driver.manage().window().fullscreen();
		
		
		
		driver.navigate().to("https://www.google.co.in/");
		WebElement searchBox= driver.findElement(By.xpath("//textarea[@name='q']"));
		//Enter key
		//searchBox.sendKeys("Bangalore"+Keys.ENTER);
		searchBox.sendKeys("Bengaluru");
		//Submit()
		//searchBox.submit();
		//Robot class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
