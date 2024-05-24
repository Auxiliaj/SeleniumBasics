package practiceselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/test-practice");
		Thread.sleep(5000);
		
		WebElement signUpLink= driver.findElement(By.linkText("Sign Up"));
		signUpLink.click();
		
		String oldWindow=driver.getWindowHandle();
		System.out.println(oldWindow);
		
		Set<String>windows= driver.getWindowHandles();
		int windowSize=windows.size();
		System.out.println(windowSize);
		for (String newWindow :windows ) {
			
			driver.switchTo().window(newWindow);
			System.out.println(newWindow);			
					
		}
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
