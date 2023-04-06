package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefination {
	WebDriver driver;

	@Given("User must be on url {string}")
	public void user_must_be_on_url(String string) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(string);
	}

	@When("Enter valid name")
	public void enter_valid_name() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Amar");
	}

	@When("Enter valid email or mobile")
	public void enter_valid_email_or_mobile() {
		driver.findElement(By.id("ap_email")).sendKeys("Amarpreet16@gmail.com");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.id("ap_password")).sendKeys("Roicians123@");
	    }

	@When("Enter same password again")
	public void enter_same_password_again() {
	   driver.findElement(By.id("ap_password_check")).sendKeys("Roicians123@");
	   }

	@When("Click on verify email or mobile")
	public void click_on_verify_email_or_mobile() {
		 driver.findElement(By.id("continue")).click();
		 }

	@Then("User must be navigated to verification window")
	public void user_must_be_navigated_to_verification_window() {
		boolean actual=driver.findElement(By.cssSelector("#cvf-input-code")).isDisplayed();
		Assert.assertEquals(true, actual);    
	}

	@When("Name field is left empty")
	public void name_field_is_left_empty() {
		driver.findElement(By.id("ap_customer_name")).sendKeys();
		}

	@When("Enter invalid email or mobile")
	public void enter_invalid_email_or_mobile() {
		driver.findElement(By.id("ap_email")).sendKeys("Amar");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.id("ap_password")).sendKeys("Amar");
		}

	@When("Enter wrong password again")
	public void enter_wrong_password_again() {
		driver.findElement(By.id("ap_password_check")).sendKeys("Amr");
		}


}
