package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfuname;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfpwd;
	
	@FindBy(how=How.CLASS_NAME, using="btn")
	@CacheLookup
	WebElement pfbutton;


public WebElement getPfuname() {
		return pfuname;
	}

   public void setPfuname(String suname) {
		pfuname.sendKeys(suname);
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}
	public void setPfpwd(String spwd) {
		pfpwd.sendKeys(spwd);
	}


	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
	pfbutton.click();
	}

	//initiating Elements
		public LoginPageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
}
