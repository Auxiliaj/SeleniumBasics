package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPracticeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement email=driver.findElement(By.xpath("//input[@title='Email']"));
		email.sendKeys("FirstName@gmail.com");
		
		WebElement passWord=driver.findElement(By.xpath("//input[@title='Password']"));
		passWord.sendKeys("FirstName@123");

	}

}
