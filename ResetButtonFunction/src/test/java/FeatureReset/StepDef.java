package FeatureReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\WorkingWithForms.html");
	    //throw new PendingException();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
		   Thread.sleep(1000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector("input.Format1")).sendKeys("Amit");
			
			driver.findElement(By.name("txtLN")).sendKeys("Pandit");
			
			driver.findElement(By.cssSelector("input[value='Male']")).click();
			
			driver.findElement(By.name("DtOB")).sendKeys("20/12/1983");
			
			driver.findElement(By.name("Email")).sendKeys("amit.pandit@igate");
			
			
			//find address textbox and enter value
			driver.findElement(By.name("Address")).sendKeys("Tilak Nagar");

			Select drpCity=new Select(driver.findElement(By.name("City")));
	    //throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("reset")).click();
	    //throw new PendingException();
	}

}
