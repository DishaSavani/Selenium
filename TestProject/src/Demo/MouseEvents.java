package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/nileshsavani/Documents/Eclipse/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/");
		//Using Action class for MouseEvents.
		Actions builder = new Actions(driver);
		
		//Drag and Drop
		//Element which needs to drag by Xpath
		WebElement From = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		//Dragged and dropped.	
		builder.dragAndDrop(From, To).build().perform();
		
		//Double Click
		WebElement doubleclick = driver.findElement(By.name("dblClick"));
		builder.doubleClick(doubleclick).perform();
	
		// To click on the 'OK' button of the alert.
		driver.switchTo().alert().accept();
		
		//keyboad Events
		//doubleclick.sendKeys(Keys.TAB);	
		//WebElement name=driver.findElement(By.cssSelector("input[id='name']"));
		//name.sendKeys("abc");
		//name.sendKeys(Keys.TAB);
		
		//Find Elements by partialLinkText()
		WebElement Partialinktext = driver.findElement(By.partialLinkText("practice"));
		Partialinktext.click();
		// Accordian Control
		driver.findElement(By.id("ui-id-1")).click();
		driver.findElement(By.id("ui-id-2")).click();
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.id("ui-id-4")).click();
		
		//contextclick 
		WebElement a = driver.findElement(By.linkText("Controls"));
		builder.contextClick(a).perform();
	
		

	}

	

}
