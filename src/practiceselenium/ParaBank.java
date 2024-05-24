package practiceselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		//driver.manage().window().maximize();
//		Dimension dimension=new Dimension(1366, 766);
//		driver.manage().window().setSize(dimension);
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("Arise");
		Thread.sleep(2000);
		//driver.get(driver.getCurrentUrl());
		//driver.navigate().refresh();
		//JavascriptExecutor executor=(JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");
		//executor.executeScript("history.go(0)");
		Robot robot =  new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
	}

}
