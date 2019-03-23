package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;
import pageBean.LoginPageFactory;

public class StepDefLoginPage 
{
	private WebDriver driver;
	private LoginPageFactory login;
	
	

@Given("^User is on hotel login page$")
public void user_is_on_hotel_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\BDD\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	login = new LoginPageFactory(driver);
	driver.get("file:///C:/BDD/login.html");
}

@Then("^check the title of the page$")
public void check_the_title_of_the_page() throws Throwable {
	String title=driver.getTitle();
	if(title.contentEquals("login")) System.out.println("****** Title Matched");
	else System.out.println("****** Title NOT Matched");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.close();
}

@When("^user enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
    login.setPfuname("capgemini");
    Thread.sleep(1000);
    login.setPfpwd("capg1234");
    Thread.sleep(1000);
    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    login.setPfbutton();
    Thread.sleep(1000);
}

@Then("^navigate to welcome page$")
public void navigate_to_welcome_page() throws Throwable {
	driver.navigate().to("file:///C:/BDD/success.html");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.close();
}

@When("^user leaves userName blank$")
public void user_leaves_userName_blank() throws Throwable {
   login.setPfuname("");
   Thread.sleep(1000);
}

@When("^clicks the button$")
public void clicks_the_button() throws Throwable {
   login.setPfbutton();
}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
    String alertMessage=driver.findElement(By.xpath(".//*[@id='userErrMsg']")).getText();
    Thread.sleep(1000);
    System.out.println("******" + alertMessage);

}

@When("^user leaves password blank and clicks the button$")
public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
    login.setPfuname("capgemini");
    Thread.sleep(1000);
	login.setPfpwd("");
	Thread.sleep(1000);
}

@When("^user enters incorrect userName$")
public void user_enters_incorrect_userName() throws Throwable {
 login.setPfuname("Capgemini");
 Thread.sleep(1000);
}

@When("^user enters incorrect password$")
public void user_enters_incorrect_password() throws Throwable {
 login.setPfpwd("Capg1234");
 Thread.sleep(1000);
}


	
}
