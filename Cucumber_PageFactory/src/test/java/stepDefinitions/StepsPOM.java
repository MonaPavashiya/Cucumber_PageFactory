package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import login_PomBase.LoginPageFactory;

public class StepsPOM 
{
	WebDriver driver;
	LoginPageFactory login;
	
	
	@Given("open browser")
	public void open_browser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter URL {string}")
	public void enter_URL(String url) {
		driver.get(url);
	}

	@Then("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String username, String password) {
		login = new LoginPageFactory(driver);
		login.entersername(username);
		login.enterPasswordS(password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		login.clickOnLogin();
	}

	@When("user clicks on React button")
	public void user_clicks_on_React_button() {
		login.clickOnReactButton();
	}

	@Then("user log out")
	public void user_log_out() {
		login.clickOnLogout();
	}

	@Then("close browser")
	public void close_browser() {
		 driver.quit();
	}
}
