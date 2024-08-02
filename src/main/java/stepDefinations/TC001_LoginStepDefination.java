package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	WebDriver driver;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	   System.out.println("Open Rediff");
	   System.out.println("Launch Rediff");
		driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
	    System.out.println("Click on Signin");
	    driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("Next page is displayed check title")
	public void next_page_is_displayed_check_title() {
	   System.out.println("Check title");
	   System.out.println("Login Rediff");
		String title=driver.getTitle();
		System.out.println("title="+title);
		Assert.assertEquals(title, "Rediffmail");
		System.out.println("Assert Executed...");
		
	}
	@When("user enters valid user name and valid password")
	public void user_enters_valid_user_name_and_valid_password() {
	   System.out.println("Enter valid user name and valid password");
	   driver.findElement(By.id("login1")).sendKeys("jack");
		driver.findElement(By.id("password")).sendKeys("jack123");
		driver.findElement(By.id("remember")).click();
	}
	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("Click on Submit");
	}
	@Then("User gets connected to his account display message as successful")
	public void user_gets_connected_to_his_account_display_message_as_successful() {
	   System.out.println("Check user");
	   System.out.println("Login Successful..");
	}
	@Then("Logout")
	public void logout() {
	    System.out.println("Logout..");
	}



}
