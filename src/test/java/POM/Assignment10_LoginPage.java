package POM;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Assignment10_LoginPage {
	private WebDriver driver;


	@CacheLookup
	@FindBy(id = "userid")
	WebElement user;

	@CacheLookup
	@FindBy(id = "password")
	WebElement passwd;


	@CacheLookup
	@FindBy(xpath="//*[@id=\"brave-app\"]/div[1]/div/form/div[1]/div[3]/button/div/span")
	WebElement loginButton;

	


	public Assignment10_LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginWithCredentials(String username, String password) throws IOException {
		
		
		
		//Reporter.log("username = " + username);
		//Reporter.log("password = " + password);
		
		user.clear();
		user.sendKeys(username);
		
		passwd.clear();
		passwd.sendKeys(password);
		
		loginButton.click();

	}


	

	}


