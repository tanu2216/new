package AccountPageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountPageFactory {
	WebDriver driver;

	@FindBy(name = "FirstName")
	@CacheLookup
	WebElement pffirstname;

	@FindBy(xpath = "html/body/form/table/tbody/tr[9]/td[1]/center/input")
	@CacheLookup
	WebElement pfsave;

	@FindBy(xpath = "html/body/form/table/tbody/tr[9]/td[2]/center/input")
	@CacheLookup
	WebElement pfcancel;

	@FindBy(name = "MName")
	@CacheLookup
	WebElement pfmiddlename;

	@FindBy(name = "LName")
	@CacheLookup
	WebElement pflastname;

	@FindBy(name = "Add")
	@CacheLookup
	WebElement pfaddress;

	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement pfcity;

	@FindBy(name = "R1")
	@CacheLookup
	WebElement pfgender;


	@FindBy(name = "LHindi")
	@CacheLookup
	WebElement pfhindi;

	@FindBy(name = "LEnglish")
	@CacheLookup
	WebElement pfenglish;

	@FindBy(name = "LMarathi")
	@CacheLookup
	WebElement pfmarathi;

	@FindBy(name = "LTamil")
	@CacheLookup
	WebElement pftamil;

	@FindBy(name = "Date")
	@CacheLookup
	WebElement pfdate;

	@FindBy(name = "Month")
	@CacheLookup
	WebElement pfmonth;

	@FindBy(name = "Year")
	@CacheLookup
	WebElement pfyear;

	public WebElement getPffirstname() {
		return pffirstname;
	}

	public void setPffirstname(String sffirstname) {
		pffirstname.sendKeys(sffirstname);
	}

	public WebElement getPfsave() {
		return pfsave;
	}

	public void setPfsave() {
		pfsave.click();
	}

	public WebElement getPfcancel() {
		return pfcancel;
	}

	public void setPfcancel() {
		pfcancel.click();
	}

	public WebElement getPfmiddlename() {
		return pfmiddlename;
	}

	public void setPfmiddlename(String sfmiddlename) {
		pfmiddlename.sendKeys(sfmiddlename);
	}

	public WebElement getPflastname() {
		return pflastname;
	}

	public void setPflastname(String sflastname) {
		pflastname.sendKeys(sflastname);
	}

	public WebElement getPfaddress() {
		return pfaddress;
	}

	public void setPfaddress(String sfaddress) {
		pfaddress.sendKeys(sfaddress);
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String sfcity) {
		Select drpCity = new Select(pfcity);
		drpCity.selectByVisibleText(sfcity);
	}

	public WebElement getPffgender() {
		return pfgender;
	}

	public void setPffgender(String sfgender) {
		pfgender=driver.findElement(By.xpath(sfgender));
		pfgender.click();
	}


	public WebElement getPfhindi() {
		return pfhindi;
	}

	public void setPfhindi() {
		pfhindi.click();
	}

	public WebElement getPfenglish() {
		return pfenglish;
	}

	public void setPfenglish() {
		pfenglish.click();
	}

	public WebElement getPfmarathi() {
		return pfmarathi;
	}

	public void setPfmarathi() {
		pfmarathi.click();
	}

	public WebElement getPftamil() {
		return pftamil;
	}

	public void setPftamil() {
		pftamil.click();
	}

	public WebElement getPfdate() {
		return pfdate;
	}

	public void setPfdate(String sfdate) {
		Select drpDate = new Select(pfdate);
		drpDate.selectByVisibleText(sfdate);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String sfmonth) {
		Select drpMonth = new Select(pfmonth);
		drpMonth.selectByVisibleText(sfmonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String sfyear) {
		Select drpYear = new Select(pfyear);
		drpYear.selectByVisibleText(sfyear);
	}

	public AccountPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
