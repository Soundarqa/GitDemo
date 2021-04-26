package stepDefinition;



import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class loginstepDefinitions {
	
	@Given("^Open the application$")
    public void open_the_application() {
		System.out.println("Step 1 completed");

    }

    @When("User is on login page")
    public void user_is_on_login_page() {
    	System.out.println("Step 2 completed");

    }

    @When("^User login to the application$")
    public void user_login_to_the_application() {
    	System.out.println("Step 3 completed");

    }

    @Then("^Home Page is displayed$")
    public void home_page_is_displayed()  {
    	System.out.println("Step 4 completed");

    }


}
