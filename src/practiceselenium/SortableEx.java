package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SortableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver.get("https://letcode.in/sortable");
			
			List<WebElement>allTask=driver.findElements(By.xpath("//div[@id='sample-box1']"));
			WebElement fromElement=allTask.get(0);
			WebElement toElement=allTask.get(6);
			Actions actions=new Actions(driver);
			actions.clickAndHold(fromElement);
			actions.moveToElement(toElement);
			actions.release(toElement).build().perform();
			
			

	}

}
