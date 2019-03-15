package FunctionReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	    throw new PendingException();
	}

	@When("^Enter the Username\"([^\"]*)\"and Password\"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		driver.findElement(By.name("uid")).sendKeys(arg1);
		   Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys(arg2);
		  Thread.sleep(1000);
	    throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("reset")).click();
	    throw new PendingException();
	}


}
