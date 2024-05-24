package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionLinK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in/");
		WebElement searchBox= driver.findElement(By.xpath("//textarea[@name='q']"));
		searchBox.sendKeys("The chronicles of Narnia \n");
		Thread.sleep(5000);
		
		List <WebElement>suggestionLinks=driver.findElements(By.xpath("//a//div//cite"));
				// "//*[@id='search']//h3//following::div//cite"));
		for(WebElement links:suggestionLinks) {
			System.out.println(links.getText());
		}

	}

}
