package login_PomBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	WebElement Username; 
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement reactButton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	public void entersername(String uname) {
		Username.sendKeys(uname);
	}
	
	public void enterPasswordS(String pwd) {
		Password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnReactButton() {
		reactButton.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}
}
