package CreateAcc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CreatePageBean.CreateAccountPageBeanFactory;

import LoginPageBean.LoginPageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pageBean.HotelBookingPageFactory;

public class StepDef {
	private WebDriver driver;
	private CreateAccountPageBeanFactory obj;
	private LoginPageFactory obj1;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   obj1= new LoginPageFactory(driver);
		   driver.get("C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\login.html");
	}

	    //throw new PendingException();
	

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		obj1.setPfusername("capgemini");	
		Thread.sleep(1000);
		obj1.setPfpwd("capg1234");	
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		obj1.setPfbutton();
		Thread.sleep(1000);
	    //throw new PendingException();
	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		driver.navigate().to("file:\\C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\CreateAccount.html");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();

	    //throw new PendingException();
	}

	@When("^user leaves user Name blank$")
	public void user_leaves_user_Name_blank() throws Throwable {
		obj1.setPfusername("");
		Thread.sleep(1000);
	}
	

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		obj.setPfbutton();
	    //throw new PendingException();
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		 String alertMessage=driver.switchTo().alert().getText();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   System.out.println("***" + alertMessage);
		   driver.close();
	    //throw new PendingException();
	}

	@When("^user leaves password blank$")
	public void user_leaves_password_blank() throws Throwable {
	   
		 obj1.setPfusername("Ruteja");  
		 Thread.sleep(1000);
		 obj1.setPfpwd("");  
		 Thread.sleep(1000);
		 obj1.setPfbutton();
	}
	

	@Given("^User is on create account page$")
	public void user_is_on_create_account_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   obj= new CreateAccountPageBeanFactory(driver);
		   driver.get("C:\\Users\\TANUSHAR\\Desktop\\Module 3\\Module 3\\CreateAccount.html");
	   // throw new PendingException();
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		 String title=driver.getTitle();
		   if(title.contentEquals("Create New Savings Account")) System.out.println("***");
		   else System.out.println("*** Title NOT Matched");
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   driver.close();
	    throw new PendingException();
	}

	@When("^user leaves first Name blank$")
	public void user_leaves_first_Name_blank() throws Throwable {
		 obj.setPffname("");Thread.sleep(1000);
	    throw new PendingException();
	}

	@When("^user leaves last Name blank and clicks the button$")
	public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
		 obj.setPffname("Tanu");   Thread.sleep(1000);
		 obj.setPflname("");   Thread.sleep(1000);
		 obj.setPfbutton();
	    //throw new PendingException();
	}

	@When("^user doesnot enter state$")
	public void user_doesnot_enter_state() throws Throwable {
		 obj.setPfstate("");Thread.sleep(1000);
	    //throw new PendingException();
	}

	@When("^user doesnot select gender$")
	public void user_doesnot_select_gender() throws Throwable {
		 obj.setPfgender("");Thread.sleep(1000);
	    //throw new PendingException();
	}

	@When("^user doesnot select mother tongue$")
	public void user_doesnot_select_mother_tongue() throws Throwable {
		 obj.setPfmothertongue("");Thread.sleep(1000);
	    //throw new PendingException();
	}

	@When("^user doesnot enter date of birth$")
	public void user_doesnot_enter_date_of_birth() throws Throwable {
		 obj.setPfdob("");Thread.sleep(1000);
	    //throw new PendingException();
	}



}