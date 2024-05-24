package practiceselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/table");
		
		Dimension dimension=new Dimension(1366, 766);
		driver.manage().window().setSize(dimension);
		
//		WebElement firstTable= driver.findElement(By.id("shopping"));
//		List<WebElement> tableHeader= firstTable.findElements(By.tagName("th"));
//		int size=tableHeader.size();
//		System.out.println(size);
//		
//	   List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr"));
//	   int rowSize=allRows.size();
//		 int sum=0;
//
//	   for(int i=0;i<rowSize;i++) {
//		  List<WebElement> cellData= allRows.get(i).findElements(By.tagName("td"));
//		 WebElement amount=cellData.get(1);        
//		 int price=Integer.parseInt(amount.getText());	
//		
//		 sum+=price;
//			    }
//	   System.out.println(sum);
//	   
//
//		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
//		int secondTableRows=tableRows.size();
//		System.out.println(secondTableRows);
//		
//		for(int i=0;i<secondTableRows;i++) {
//			  List<WebElement> cellData= tableRows.get(i).findElements(By.tagName("td"));
//			  WebElement lastName=cellData.get(1);
//			  String name=lastName.getText();
//			  System.out.println(name);
//			  if(name.equals("Raj")) {
//				  WebElement checkBox=cellData.get(3);
//				  Thread.sleep(2000);
//				  checkBox.findElement(By.tagName("input")).click();
//				  break;
//			  }
//			  
			  
			List<WebElement> sortTable= driver.findElements(By.xpath("//body/app-root[1]/app-simpletable[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tr/td[1]"));
			int sortSize= sortTable.size();
			System.out.println(sortSize);
			
			for(int i=0;i<sortSize;i++) {
				
			}
			
		//}

	}

}
