package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyPress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.navigate().to("https://formy-project.herokuapp.com/");
		Thread.sleep(2000);
		
		WebElement keyPress= driver.findElement(By.xpath("//body/div//li[9]/a"));
		keyPress.click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Krissy");
		WebElement submitButton= driver.findElement(By.id("button")); 
		submitButton.click();

	}

}
