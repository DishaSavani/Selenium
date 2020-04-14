package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/nileshsavani/Documents/Eclipse/chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.Facebook.com");
		 
		 //Locating by ID and name
		 driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");	
		 driver.findElement(By.name("pass")).sendKeys("abcd");	
		 
		 WebElement firstname =  driver.findElement(By.name("firstname"));	
		 firstname.sendKeys("disha");
		 
		 //deleting textbox
		 firstname.clear();
		 
		 
		 //Locating by Link Text
		 
		driver.findElement(By.linkText("Create a Page")).click();
		
		//back to page
		driver.navigate().back();
		
		 //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 //droup Down
		 
		 Select month = new Select(driver.findElement(By.name("birthday_month")));
		 month.selectByVisibleText("Oct");
		 
		 Select date = new Select(driver.findElement(By.name("birthday_day")));
		 date.selectByValue("3");
		 
	
		 
		 Select year = new Select(driver.findElement(By.name("birthday_year")));
		 year.selectByValue("1991");
		 
		
		 
		 //redio button
		 
		 WebElement female = driver.findElement(By.id("u_0_6"));
		 WebElement male = driver.findElement(By.id("u_0_7"));
		 female.click();
	     male.click();
	     
	     driver.findElement(By.name("websubmit")).click();
		 
		 
		// driver.quit();

	}

}
