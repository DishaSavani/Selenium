package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/nileshsavani/Documents/Eclipse/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		
		WebElement SwitchTo = driver.findElement(By.linkText("Switch to"));
		SwitchTo.click();
		
		// Simple Alert
		WebElement Simplealert = driver.findElement(By.id("alert"));
		Simplealert.click();
		Thread.sleep(5000);
		// To click on the 'OK' button of the alert.
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		WebElement alert = driver.findElement(By.id("confirm"));
		alert.click();
		Thread.sleep(5000);
		// To click on the 'Cancel' button of the alert.
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		// Prompt Alert.
		WebElement Promptalert = driver.findElement(By.id("prompt"));
		Promptalert.click();
		Thread.sleep(5000);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Disha");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Model Control
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[4]")).click();
	
	}

}
