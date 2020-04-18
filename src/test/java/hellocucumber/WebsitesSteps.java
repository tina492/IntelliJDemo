package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebsitesSteps {

    @Given("I am visiting in {string}")
    public void i_am_visiting_in(String nameOfWebsite) {
     System.out.println(nameOfWebsite);
    }

    @When("I access {string}")
    public void i_access(String URL) {
    System.out.println(URL);
    }

    @Then("I am greeted with {string}")
    public void i_am_greeted_with(String message) {
    System.out.println(message);
    }







}
