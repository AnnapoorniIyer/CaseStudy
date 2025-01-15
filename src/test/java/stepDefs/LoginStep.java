package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {
		WebDriver driver=TestBase.getDriver();
		LoginPage loginPage;
		
		public LoginStep() {
			loginPage=new LoginPage(driver);
		}
	 
		@Given("User is on Login page")
		public void user_is_on_login_page() {
			
//		    driver=new ChromeDriver();
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		    driver.get("https://conduit-realworld-example-app.fly.dev/");
			TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
	
//		    loginPage=new LoginPage(driver);
		    
		    loginPage.ClickLogin();
		    
		}
		
		@When("User provides {string} and {string}")
		public void user_provides_and(String username, String password) {
//			Thread.sleep(5000);
			loginPage.validLogin(username, password);
		}

		
		@Then("User should be on Home Page")
		public void user_should_be_on_home_page() {
			Assert.assertEquals(driver.getTitle(),"Conduit");
		    
		}
	}

