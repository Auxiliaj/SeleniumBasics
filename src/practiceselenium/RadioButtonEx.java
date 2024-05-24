package practiceselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/dropable");
		//driver.switchTo().frame(1);
		//Thread.sleep(3000);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement sampleBox=driver.findElement(By.id("draggable"));
		wait.until(ExpectedConditions.elementToBeClickable(sampleBox));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		Actions actions =new Actions(driver);
		actions.dragAndDrop(sampleBox, targetElement).build().perform();
		//actions.clickAndHold(sampleBox).moveByOffset(30, 40).build().perform();

	}

}
