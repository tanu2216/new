package LoginPageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	public LoginPageFactory(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

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

	public void setPfusername(String sfname) {
		pfuname.sendKeys(sfname);
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}
	public void setPfpwd(String sfpwd) {
		pfpwd.sendKeys(sfpwd);
	}
	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

}
