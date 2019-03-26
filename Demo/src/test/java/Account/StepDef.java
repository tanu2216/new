package Account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AccountPageBean.AccountPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	private WebDriver driver;
	private AccountPageFactory objhbpg;

	@Given("^User is on create new savings account page$")
	public void user_is_on_create_new_savings_account_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITISHAG\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbpg = new AccountPageFactory(driver);
		driver.get("file:\\\\C:\\Users\\NITISHAG\\Desktop\\mod\\CreateAccount.html");
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String title = driver.getTitle();
		String pageHeading = driver.findElement(By.xpath("html/body/form/h1/font")).getText();
		System.out.println("Title is : " + pageHeading);

		if (title.contentEquals("Welcome"))
			System.out.println("****** Title Matched******");
		else
			System.out.println("****** Title NOT Matched******");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^User leaves first Name blank$")
	public void user_leaves_first_Name_blank() throws Throwable {
		objhbpg.setPffirstname("");
		Thread.sleep(1000);
	}

	@Then("^Save the credentials$")
	public void save_the_credentials() throws Throwable {
		objhbpg.setPfsave();
	}

	@When("^User leaves middle name blank$")
	public void user_leaves_middle_name_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("");
		driver.navigate().to("file:///C:/Users/NITISHAG/Desktop/mod/Welcome.html?FirstName=Nitisha&MName=&LName=&Add=&city=Mumbai&R1=Female&Date=1&Month=January&Year=1970&Save=Save");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User leaves last name blank$")
	public void user_leaves_last_name_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPflastname("");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User leaves address blank$")
	public void user_leaves_address_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("Gupta");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User leaves city blank$")
	public void user_leaves_city_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("G");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Select City");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User leaves gender blank$")
	public void user_leaves_gender_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("G");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Select City");
		Thread.sleep(1000);
		objhbpg.setPffgender("");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User leaves mother tongue blank$")
	public void user_leaves_mother_tongue_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("G");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Bangalore");
		Thread.sleep(1000);
		objhbpg.setPffgender("Female");
		Thread.sleep(1000);
		/*objhbpg.setPfhindi();
		Thread.sleep(1000);
		objhbpg.setPfenglish();
		Thread.sleep(1000);*/
		objhbpg.setPfsave();
	}

	@When("^User leaves date of birth blank$")
	public void user_leaves_date_of_birth_blank() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("G");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Bangalore");
		Thread.sleep(1000);
		objhbpg.setPffgender("Female");
		Thread.sleep(1000);
		objhbpg.setPfhindi();
		Thread.sleep(1000);
		objhbpg.setPfenglish();
		Thread.sleep(1000);
		objhbpg.setPftamil();
		Thread.sleep(1000);
		objhbpg.setPfdate("");
		Thread.sleep(1000);
		objhbpg.setPfmonth("");
		Thread.sleep(1000);
		objhbpg.setPfyear("");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		objhbpg.setPffirstname("Nitisha");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("G");
		Thread.sleep(1000);
		objhbpg.setPflastname("Agrawal");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Bangalore");
		Thread.sleep(1000);
		objhbpg.setPffgender("Female");
		Thread.sleep(1000);
		objhbpg.setPfhindi();
		Thread.sleep(1000);
		objhbpg.setPfenglish();
		Thread.sleep(1000);
		objhbpg.setPfdate("07");
		Thread.sleep(1000);
		objhbpg.setPfmonth("January");
		Thread.sleep(1000);
		objhbpg.setPfyear("1998");
		Thread.sleep(1000);
		objhbpg.setPfsave();
	}

	@When("^User enters invalid data$")
	public void user_enters_invalid_data() throws Throwable {
		objhbpg.setPffirstname("Rishabh");
		Thread.sleep(1000);
		objhbpg.setPfmiddlename("Kumar");
		Thread.sleep(1000);
		objhbpg.setPflastname("Gupta");
		Thread.sleep(1000);
		objhbpg.setPfaddress("Bara Bazaar");
		Thread.sleep(1000);
		objhbpg.setPfcity("Bangalore");
		Thread.sleep(1000);
		objhbpg.setPffgender("Female");
		Thread.sleep(1000);
		objhbpg.setPfhindi();
		Thread.sleep(1000);
		objhbpg.setPfenglish();
		Thread.sleep(1000);
		objhbpg.setPfdate("07");
		Thread.sleep(1000);
		objhbpg.setPfmonth("January");
		Thread.sleep(1000);
		objhbpg.setPfyear("1998");
		Thread.sleep(1000);
	}

	@Then("^Cancel the credentials$")
	public void cancel_the_credentials() throws Throwable {
		objhbpg.setPfcancel();
	}

}
