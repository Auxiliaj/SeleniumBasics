package practiceselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement firstName=driver.findElement(By.xpath("//label[contains(text(),'First')]//following-sibling::input[1]"));
		firstName.sendKeys("Jeeva");
		
		WebElement lastName=driver.findElement(By.xpath("//form//div//input[2]"));
		lastName.sendKeys("Anantham");
		
		WebElement eMail=driver.findElement(By.xpath("//form//div//input[3]"));
		eMail.sendKeys("jeevaAnantham@gmail.com");
		
		WebElement passWord=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		passWord.sendKeys("Jeeva@213");
		
		WebElement confirmPassWord=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		confirmPassWord.sendKeys("Jeeva@213");
		
//		WebElement button=driver.findElement(By.xpath("//form//div//button[1]"));
//		button.click();
		
//		WebElement clearButton=driver.findElement(By.xpath("//button[@type='reset']"));
//		clearButton.click();
		
//		WebElement resetButton=driver.findElement(By.xpath("//form//div//button[3]"));
//		resetButton.click();
		
		
		WebElement refreshButton=driver.findElement(By.xpath("//input[@name='refreshbtn']"));
		refreshButton.click();
		
	}

}
