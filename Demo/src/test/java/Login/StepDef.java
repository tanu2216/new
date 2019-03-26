package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPageBean.LoginPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	private WebDriver driver;
	private LoginPageFactory objhbpg;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITISHAG\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbpg = new LoginPageFactory(driver);
		driver.get("file:\\\\C:\\Users\\NITISHAG\\Desktop\\mod\\login.html");
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
			String title = driver.getTitle();
			String pageHeading = driver.findElement(By.xpath("//*[@id='mainCnt']/div/div[1]/h1")).getText();
			System.out.println("Title is : " + pageHeading);

			if (title.contentEquals("login"))
				System.out.println("****** Title Matched******");
			else
				System.out.println("****** Title NOT Matched******");
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.close();
	}

	@When("^User leaves User Name blank$")
	public void user_leaves_User_Name_blank() throws Throwable {
			objhbpg.setPfusername("");
			Thread.sleep(1000);
	}

	@When("^Clicks the button$")
	public void clicks_the_button() throws Throwable {
		objhbpg.setPfbutton();
	}

	@Then("^Display alert msg$")
	public void display_alert_msg() throws Throwable {
		String alertMessage = driver.findElement(By.xpath("//*[@id='userErrMsg']")).getText();
		Thread.sleep(1000);
		// driver.switchTo().alert().accept();
		System.out.println("******" + alertMessage);
		// driver.close();
	}

	@When("^User leaves password blank$")
	public void user_leaves_password_blank() throws Throwable {
		objhbpg.setPfusername("capgemini");
		Thread.sleep(1000);
		objhbpg.setPfuserpwd("");
		Thread.sleep(1000);
		objhbpg.setPfbutton();
	}

	@Then("^Display alert msgs$")
	public void display_alert_msgs() throws Throwable {
		String alertMessage = driver.findElement(By.xpath("//*[@id='pwdErrMsg']")).getText();
		Thread.sleep(1000);
		// driver.switchTo().alert().accept();
		System.out.println("******" + alertMessage);
	}

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		objhbpg.setPfusername("capgemini");
		Thread.sleep(1000);
		objhbpg.setPfuserpwd("capg1234");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		objhbpg.setPfbutton();
		Thread.sleep(1000);
	}

	@Then("^Navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		driver.navigate().to("file:///C:/Users/NITISHAG/Desktop/mod/CreateAccount.html");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

}
