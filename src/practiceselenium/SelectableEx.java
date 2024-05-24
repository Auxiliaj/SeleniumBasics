package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to("https://letcode.in/selectable");
		
		List<WebElement> selectableList=driver.findElements(By.xpath("//div[@id='selectable']"));
		
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectableList.get(0)).click(selectableList.get(1)).
	    click(selectableList.get(2)).click(selectableList.get(3)).click(selectableList.get(4)).
		click(selectableList.get(5)).click(selectableList.get(6)).click(selectableList.get(7)).
		click(selectableList.get(8)).build().perform();
		
//		actions.clickAndHold(selectableList.get(0));
//		actions.clickAndHold(selectableList.get(1));
//		actions.clickAndHold(selectableList.get(2));
//		actions.clickAndHold(selectableList.get(3));
//		actions.clickAndHold(selectableList.get(4));
//		actions.clickAndHold(selectableList.get(5));
//		actions.clickAndHold(selectableList.get(6));
//		actions.clickAndHold(selectableList.get(7));
//		actions.clickAndHold(selectableList.get(8));
//		actions.build().perform();
	}

}
