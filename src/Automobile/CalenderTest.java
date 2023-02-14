package Automobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		
		
		calenderHandling("2024","March","14");
		
		
	}
	

	 public static void calenderHandling(String year, String month, String date) {
			
		 driver.findElement(By.id("opendateofmanufacturecalender")).click();
		 String currentYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		 System.out.println(currentYear);

		 if(!currentYear.equals(year))
			{
				do{
					driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
				}while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year));
				
			}
			
		 
		 String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
			if(!currentMonth.equalsIgnoreCase(month))
				
			{
				do{
					driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
				}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(month));
				
			}
			 
			
			/*
			 * List<WebElement> d =
			 * driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
			 * 
			 * for (int i = 0; i<d.size(); i++) { //check expected data String s =
			 * d.get(i).getText(); if (s.equals(date)) { d.get(i).click(); break;
			 * 
			 * }
			 * 
			 * }
			 */
	 }
	 
}