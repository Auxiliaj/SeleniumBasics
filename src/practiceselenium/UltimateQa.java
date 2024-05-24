package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation");
		
		WebElement manyElements=driver.findElement(By.linkText("Big page with many elements"));
		manyElements.click();
		Thread.sleep(4000);
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("Angel");
		WebElement eMail= driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		eMail.sendKeys("Angel@gmail.com");
		WebElement message= driver.findElement(By.cssSelector("#et_pb_contact_message_0"));
		message.sendKeys("Glad to be here");
		WebElement captcha= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/p[1]/input[1]"));
		captcha.sendKeys("23");
		
		WebElement submitBtn=driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]"));
		submitBtn.click();
		
		
	}

}
