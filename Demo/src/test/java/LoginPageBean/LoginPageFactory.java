package LoginPageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfusername;
	
	@FindBy(xpath="//*[@id='mainCnt']/div/div[1]/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement pfbutton;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfuserpwd;

	public WebElement getPfusername() {
		return pfusername;
	}

	public void setPfusername(String susername) {
		pfusername.sendKeys(susername);;
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPfuserpwd() {
		return pfuserpwd;
	}

	public void setPfuserpwd(String suserpwd) {
		pfuserpwd.sendKeys(suserpwd);
	}
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
