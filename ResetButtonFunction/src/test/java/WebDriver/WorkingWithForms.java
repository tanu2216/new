package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) {
		// WebDriver driver=new FirefoxDriver();
		// driver.get("file://///ndafile/GLC-G102/BDD/WorkingWithForms.html");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\WorkingWithForms.html");
		try {
			
		
		driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
		   Thread.sleep(1000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		  Thread.sleep(1000);
		  

			driver.findElement(By.className("Format")).sendKeys("igate");
			  Thread.sleep(1000);


	}
		catch(Exception e) {
			System.out.println("some exception");
			}
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Amit");
		
		driver.findElement(By.name("txtLN")).sendKeys("Pandit");
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		
		driver.findElement(By.name("DtOB")).sendKeys("20/12/1983");
		
		driver.findElement(By.name("Email")).sendKeys("amit.pandit@igate");
		
		
		//find address textbox and enter value
		driver.findElement(By.name("Address")).sendKeys("Tilak Nagar");

		Select drpCity=new Select(driver.findElement(By.name("City")));
		
		//drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
		//drpCity.selectByIndex(1);
		
		//find phone textbox and enter value
		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9837225617");
	  driver.findElement(By.cssSelector("input[value='Reading']")).click();
	
	  
	
		driver.findElement(By.name("reset")).click();
		
}
}
