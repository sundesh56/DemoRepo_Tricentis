package Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("nav_automobile")).click();
		driver.findElement(By.id("enterinsurantdata")).click();
		driver.findElement(By.id("opendateofbirthcalender")).click();
		
		String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
		System.out.println(currentMonth);
		
		driver.findElement(By.xpath("//a[@class = 'ui-datepicker-prev ui-corner-all']")).click();
		
	
		
	}

}
