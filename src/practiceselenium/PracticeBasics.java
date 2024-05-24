package practiceselenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBasics {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/test");
				
//		try {
//			WebElement editButton=driver.findElement(By.linkText("Edit"));
//			editButton.click();
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		WebElement firstName=driver.findElement(By.xpath("//input[@id='fullName']"));
//		firstName.sendKeys("Krissy");
//		
//		WebElement appendBox= driver.findElement(By.id("join"));
//		appendBox.sendKeys("girl");
//		Thread.sleep(2000);
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		WebElement dontWrite=driver.findElement(By.id("dontwrite"));
//		String status=dontWrite.getAttribute("readonly");
//		Thread.sleep(2000);
//
//		if (status.equals("true")) {
//			System.out.println("Text box is read only");
//		}
//		
		WebElement editButton=driver.findElement(By.linkText("Click"));
		editButton.click();
		Thread.sleep(2000);
		
		
		WebElement btnPosition=driver.findElement(By.id("position"));
		Point point= btnPosition.getLocation();
		int height=btnPosition.getSize().getHeight();
		int width=btnPosition.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		int xValue=point.getX();
		int yValue=point.getY();
		System.out.println("X value:" +xValue +"Y value:"+yValue);
		
	
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println(color);
		
		
		
	}	

}
