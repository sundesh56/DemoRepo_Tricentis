package Truck;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import HomePage.BaseClass;

public class TruckInsurance extends BaseClass {
//	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
	//	driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav_truck")).click();
		
		// Enter Vehicle Data
		// Make
		
		Select sc = new Select(driver.findElement(By.id("make")));
		sc.selectByValue("Volvo");
		
		// Engine Performance [kW]
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		
		// Date of Manufacture 
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/12/2012");
		
		// Number of Seats
		Select sc1 = new Select(driver.findElement(By.id("numberofseats")));
		sc1.selectByValue("5");
		
		// Fuel Type
		Select sc2 = new Select(driver.findElement(By.id("fuel")));
		sc2.selectByValue("Diesel");
		
		// Payload [kg]
		driver.findElement(By.id("payload")).sendKeys("500");
		
		// Total Weight [kg]
		driver.findElement(By.id("totalweight")).sendKeys("10000");
		
		// List Price [$]
		driver.findElement(By.id("listprice")).sendKeys("1111");
		
		// License Plate Number
		driver.findElement(By.id("licenseplatenumber")).sendKeys("Pune");
		
		// Annual Mileage [mi]
		driver.findElement(By.id("annualmileage")).sendKeys("5000");
		
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		// First name
		driver.findElement(By.id("firstname")).sendKeys("Tony");
		
		// Last name
		driver.findElement(By.id("lastname")).sendKeys("Stark");
		
		//DOB
		driver.findElement(By.id("birthdate")).sendKeys("04/04/2000");
		
		//Gender
		gender("male");
		
		// Street Address
		driver.findElement(By.id("streetaddress")).sendKeys("Pune");
		
		// Country
		Select country = new Select(driver.findElement(By.id("country")));		
		country.selectByValue("Canada");
		
		// Zip Code
		driver.findElement(By.id("zipcode")).sendKeys("111111");
		
		// City
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		// Occupation
		Select occupation = new Select(driver.findElement(By.id("occupation")));	
		occupation.selectByValue("Employee");
		
		// Hobbies
		hobbies("Skydiving");
		
		// Website
		driver.findElement(By.id("website")).sendKeys("www.xyz.com");
		
		// Picture
		driver.findElement(By.id("picturecontainer")).sendKeys("D:\\Automation\\DSC_1082.JPG");
		
		// Next
		driver.findElement(By.id("nextenterproductdata")).click();		
		
		// Start Date
		driver.findElement(By.id("startdate")).sendKeys("12/12/2023");
		
		// Insurance Sum [$]
		Select ins =  new Select(driver.findElement(By.id("insurancesum")));
		ins.selectByValue("5000000");
		
		// Damage Insurance
		Select dins =  new Select(driver.findElement(By.id("damageinsurance")));
		dins.selectByValue("Full Coverage");
		
		// Optional Products		
		driver.findElement(By.xpath("//input[@id = 'EuroProtection']/..//span")).click();
		
		// Next
		driver.findElement(By.id("nextselectpriceoption")).click();		
		
		
		// Select Price Option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='selectultimate']/../span")).click();
		
		// VIEW QUOTE
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-file-pdf-o'])[1]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWindow = driver.getWindowHandle();
		
		 for (String winHandle : driver.getWindowHandles()) {
			  driver.switchTo().window(winHandle);
		
	//	Set<String> handles = driver.getWindowHandles();
	//	Iterator<String> it = handles.iterator();
	//	String parent = (String) it.next();
	//	String child = (String) it.next();
		
		
	System.out.println(driver.getTitle());
		
		
		
		
		
	}
	}

}
