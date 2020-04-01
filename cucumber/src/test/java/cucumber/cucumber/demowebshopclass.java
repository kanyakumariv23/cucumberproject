package cucumber.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshopclass {

	
	
	@Given("user launched chrome browser")
	public void user_launched_chrome_browser() {
	   
	}

	@Given("user provides the valid url")
	public void user_provides_the_valid_url() {
		System.out.println("provide valid url");
	  
	}

	@Given("user clicks on login hyperlink")
	public void user_clicks_on_login_hyperlink() {
		System.out.println("click hyperlink");  
	}

	@When("user provides valid Email and Password")
	public void user_provides_valid_Email_and_Password() {
		System.out.println("Enter email and password");
	}

	@When("he clicks on Login button")
	public void he_clicks_on_Login_button() {
		System.out.println("click");
	    
	}

	@Then("user shall be able to view the homepage")
	public void user_shall_be_able_to_view_the_homepage() {
		System.out.println("see homepage");
	    
	}

	@Then("see the welcome message")
	public void see_the_welcome_message() {
		System.out.println("welcome");
	   
	}


}
