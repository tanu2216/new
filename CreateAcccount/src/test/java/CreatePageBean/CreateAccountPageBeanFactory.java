package CreatePageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageBeanFactory {
	public CreateAccountPageBeanFactory(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement pffname;

	//using how class
	@FindBy(how=How.ID, using="Submit")
	@CacheLookup
	WebElement pfbutton;

	@FindBy(xpath="//*[@id='txtLastName']")
	@CacheLookup
	WebElement pflname;
	
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement pfcity;
	
	@FindBy(how=How.NAME, using="address")
	@CacheLookup
	WebElement pfaddress;
	
	@FindBy(how=How.NAME, using="R1")
	@CacheLookup
	WebElement pfgender;
	
	@FindBy(how=How.NAME, using="LEnglish")
	@CacheLookup
	WebElement pfenglish;
	
	@FindBy(how=How.NAME, using="LHindi")
	@CacheLookup
	WebElement pfhindi;
	
	@FindBy(how=How.NAME, using="LMarathi")
	@CacheLookup
	WebElement pfmarathi;
	
	@FindBy(how=How.NAME, using="Date")
	@CacheLookup
	WebElement pfdate;
	
	@FindBy(how=How.NAME, using="Month")
	@CacheLookup
	WebElement pfmonth;
	
	@FindBy(how=How.NAME, using="Year")
	@CacheLookup
	WebElement pfyear;

	public WebElement getPffname() {
		return pffname;
	}

	public void setPffname(String sfname) {
		pffname.sendKeys(sfname);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String sflname) {
		pflname.sendKeys(sflname);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String sfcity) {
		Select drpCity = new Select(pfcity);
		drpCity.selectByVisibleText(sfcity);
	}

	public WebElement getPfaddress() {
		return pfaddress;
	}

	public void setPfaddress(String sfaddress) {
		pfaddress.sendKeys(sfaddress);
	}

	public WebElement getPfgender() {
		return pfgender;
	}

	public void setPfgender(String sfgender) {
		pfgender=driver.findElement(By.xpath(sfgender));
		pfgender.click();
	}

	public WebElement getPfenglish() {
		return pfenglish;
	}

	public void setPfenglish(WebElement pfenglish) {
		this.pfenglish = pfenglish;
	}

	public WebElement getPfhindi() {
		return pfhindi;
	}

	public void setPfhindi(WebElement pfhindi) {
		this.pfhindi = pfhindi;
	}

	public WebElement getPfmarathi() {
		return pfmarathi;
	}

	public void setPfmarathi(WebElement pfmarathi) {
		this.pfmarathi = pfmarathi;
	}

	public WebElement getPfdate() {
		return pfdate;
	}

	public void setPfdate(String sfdate) {
		Select drpCity = new Select(pfdate);
		drpCity.selectByVisibleText(sfdate);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String sfmonth) {
		Select drpCity = new Select(pfmonth);
		drpCity.selectByVisibleText(sfmonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String sfyear) {
		Select drpCity = new Select(pfyear);
		drpCity.selectByVisibleText(sfyear);
	}

	public void setPfstate(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setPfmothertongue(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setPfdob(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}

	