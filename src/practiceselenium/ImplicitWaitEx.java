package practiceselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//PageFactory.initElements(driver, ActiveElement.class);
		driver.switchTo().activeElement().sendKeys("Switzerland \n");	
		//Taking ScreenShot
		TakesScreenshot scrShot=(TakesScreenshot) driver;
		File sFile=scrShot.getScreenshotAs(OutputType.FILE);
		File desFile=new File("D://image.png");
		try {
			FileHandler.copy(sFile, desFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
		
		
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
//				pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
//		WebElement element= wait.until(new Function<WebDriver, WebElement>() {
//
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id(null));
//			}
//
//			
//		});
//				
//		element.click();	
				
	}

}
