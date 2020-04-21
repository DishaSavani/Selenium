package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","/Users/nileshsavani/Documents/Eclipse/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Printing cell Value
		String cellText = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td")).getText();
		System.out.println("Cell Value is " +cellText);
		System.out.println("************************************");
		//Printing Total Rows 
		List<WebElement> Rows= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total rows found in table:"+ (Rows.size()-1));
		System.out.println("************************************");
		//Printing Total Cols
		List<WebElement> Cols= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		
		System.out.println("Total Cols found in table:" + Cols.size() );
		System.out.println("************************************");
		String beforepath =  "//*[@id=\"customers\"]/tbody/tr[";
		String afterpath = "]/td[1]";
		
		for(int i=2; i<=7; i++) {
				
			String actualpath = beforepath + i + afterpath ;
			WebElement elememt = driver.findElement(By.xpath(actualpath));
		//	System.out.println(elememt.getText());
			
				if(elememt.getText().equals("Island Trading"))
				{
					System.out.println("Company Name:" + elememt.getText() + " is Found" + " at Position: "+ i);
					break;
				}
			
		}
		System.out.println("************************************");
		// Printing table header of a web table assuming first row as header
		List<WebElement> allHeadersOfTable= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		System.out.println("Headers in table are below:");
		System.out.println("Total headers found: "+allHeadersOfTable.size());
		for(WebElement header:allHeadersOfTable)
		{
			System.out.println(header.getText());
		}
		System.out.println("************************************");
		
		//Printing All Country
		String afterxpathcontact = "]/td[3]";
		for(int i=2; i<=7; i++) {
			String actualpath = beforepath + i + afterxpathcontact ;
			WebElement element = driver.findElement(By.xpath(actualpath));
			System.out.println(element.getText());
		}
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		

	}

}
