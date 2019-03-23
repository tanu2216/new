package LoginWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLoginPage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/BDD/login.html");

		// user enters all correct data
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		driver.get("file:///C:/BDD/login.html");

		// username is blank
		driver.findElement(By.name("userName")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		String alert = driver.findElement(By.id("userErrMsg")).getText();
		driver.findElement(By.name("userPwd")).clear();

		// password is blank
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		String alert2 = driver.findElement(By.id("pwdErrMsg")).getText();
		System.out.println("Alert is:" + alert);
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).clear();

		// incorrect username
		driver.findElement(By.name("userName")).sendKeys("Capgemini");
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();

		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("*" + alertMessage);

		driver.findElement(By.name("userName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).clear();
		Thread.sleep(1000);

		// incorrect password
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		Thread.sleep(1000);
		driver.findElement(By.name("userPwd")).sendKeys("Capg1234");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println("*" + alertMessage2);
		Thread.sleep(1000);
		Alert alertMessage1 = driver.switchTo().alert();
		alertMessage1.dismiss();
		driver.close();

	}

}