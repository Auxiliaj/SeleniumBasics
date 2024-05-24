


package practiceselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class OpenGoogle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Fgere");
		try {
			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_F5);
			robot.keyRelease(KeyEvent.VK_F5);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.get(driver.getCurrentUrl());
//		JavascriptExecutor executor= (JavascriptExecutor) driver;
//		executor.executeScript("history.go(0)");
//		driver.get("https://www.saucedemo.com/");
//		
//		
//		WebElement userName= driver.findElement(By.id("user-name"));
//		userName.sendKeys("standard_user");
//		WebElement passWord=driver.findElement(By.id("password"));
//		passWord.sendKeys("secret_sauce");
//	
//		WebElement loginButton=driver.findElement(By.id("login-button"));
//		loginButton.click();
//		
//		WebElement addToCart= driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[4]"));
//		addToCart.click();
//		
//		WebElement cartCount= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]//a//span"));
//		String count=cartCount.getText();
//		System.out.println(count);
//		
//		
//		WebElement filterBox = driver.findElement(By.xpath("//span//select"));
//		Select select=new Select(filterBox);
//		select.selectByIndex(3);
//		
//		
////		Thread.sleep(3000);
////		driver.quit();
		
		
		
		
	}

}
