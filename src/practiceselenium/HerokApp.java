package practiceselenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HerokApp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.navigate().to("https://formy-project.herokuapp.com/");
		Thread.sleep(2000);
		WebElement dragLink=driver.findElement(By.linkText("Drag and Drop"));
		dragLink.click();
		Thread.sleep(2000);
		
		WebElement from= driver.findElement(By.xpath("//div[@id='image']"));
		WebElement to= driver.findElement(By.xpath("//div[@id='box']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(from,to).build().perform();
		
		
//		Robot robot= new Robot();
//		robot.
		
//		WebElement datePickerLink= driver.findElement(By.linkText("Datepicker"));
//		datePickerLink.click();
//		Thread.sleep(2000);
//		
//		WebElement datePicker=driver.findElement(By.id("datepicker"));
//		datePicker.sendKeys("01/17/2016");
	}

}
