package steps.ICF_home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

    @Given("I am on the ICF Homepage")
    public void i_am_on_the_icf_homepage() {
        System.out.println("I am on the Homepage");

    }
    @When("I click the create account button")
    public void i_click_the_create_account_button() {
        System.out.println("I click the create account button");

    }
    @Then("the create account page is displayed")
    public void the_create_account_page_is_displayed() {
        System.out.println("the create account page is displayed");

    }
    @Then("the create account form is displayed")
    public void the_create_account_form_is_displayed() {
        System.out.println("the create account form is displayed");

    }
}
