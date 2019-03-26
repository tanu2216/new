package AccountWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountWebDriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITISHAG\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\NITISHAG\\Desktop\\mod\\CreateAccount.html");
		
		driver.findElement(By.name("FirstName")).sendKeys("Nitu");
		Thread.sleep(1000);
		
		driver.findElement(By.name("MName")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[1]/center/input")).click();
		driver.navigate().to("file:///C:/Users/NITISHAG/Desktop/mod/Welcome.html?FirstName=Nitisha&MName=&LName=&Add=&city=Mumbai&R1=Female&Date=1&Month=January&Year=1970&Save=Save");
		
	}
	
}
