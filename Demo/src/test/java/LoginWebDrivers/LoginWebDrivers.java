package LoginWebDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebDrivers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITISHAG\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\NITISHAG\\Desktop\\mod\\login.html");

		driver.findElement(By.name("userName")).sendKeys("");
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).sendKeys("");
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn")).click();

		driver.findElement(By.name("userName")).clear();
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).clear();
		Thread.sleep(1000);

		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).sendKeys("");
		Thread.sleep(1000);

		driver.findElement(By.name("userName")).clear();
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.name("userName")).sendKeys("");
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);

		driver.findElement(By.name("userName")).clear();
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);

		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);

		driver.findElement(By.className("btn")).click();

	}
}
