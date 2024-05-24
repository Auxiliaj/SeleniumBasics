package practiceselenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement menu= driver.findElement(By.xpath("//*[@id=\'menuform:j_idt43\']/a"));
		menu.click();
		
		WebElement fileLink= driver.findElement(By.linkText("File"));
		fileLink.click();

		WebElement downloadButton= driver.findElement(By.xpath("//span[contains(text(),'Download')]"));
		downloadButton.click();
		File fileLocation= new File("C:\\Users\\Admin\\Downloads");
		File[] allFiles= fileLocation.listFiles();
		for (File file : allFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File was downloaded");
				break;
			}
		}
		
		
	}

}
