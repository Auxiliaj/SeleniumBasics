package practiceselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/alert");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement simpleAlert= driver.findElement(By.id("accept"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement acceptAlert= driver.findElement(By.id("confirm")); 
		acceptAlert.click();
		driver.switchTo().alert().dismiss();
		
		WebElement promptAlert= driver.findElement(By.id("prompt"));
		promptAlert.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Angel");
		alert.accept();
		
		
		
		
	

	}

}
