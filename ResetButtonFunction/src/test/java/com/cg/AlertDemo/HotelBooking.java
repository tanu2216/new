package com.cg.AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\HotelBooking.html");
		Thread.sleep(500);


		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);

		driver.findElement(By.id("txtFirstName")).sendKeys("tanu");
		Thread.sleep(500);
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);

		driver.findElement(By.id("txtLastName")).sendKeys("Sharma");
		Thread.sleep(500);
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);
		

		driver.findElement(By.id("txtEmail")).sendKeys("tanu.sharma@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);
        
		//Validation for mobile no
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("9837225617");
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		
		driver.findElement(By.id("txtPhone")).sendKeys("9837225617");
		//driver.findElement(By.tagName("textarea")).sendKeys("hgfhfgdghfghfghfghfg");
		Thread.sleep(500);
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);
		
		
		//for selecting city
		
		Select drpcity=new Select(driver.findElement(By.name("city")));
		drpcity.selectByVisibleText("Pune");
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);
		
		//for selecting state
		
		Select drpState=new Select(driver.findElement(By.name("state")));
		drpState.selectByIndex(2);
		driver.findElement(By.id("btnPayment")).click();
		callAllert();
		Thread.sleep(500);
		//for selecting number of guests
		
		Select drpguests=new Select(driver.findElement(By.name("persons")));
		drpguests.selectByIndex(2);
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(500);
		callAllert();
	}

	public static void callAllert() throws InterruptedException {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}

}
