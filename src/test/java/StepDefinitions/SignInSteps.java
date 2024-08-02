package StepDefinitions;

import io.cucumber.java.en.*;

public class SignInSteps {

    @Given("user in amazon sign in page")
    public void user_in_amazon_sign_in_page() {
        System.out.println("Inside Step - user in amazon sign in page");
    }
    @Given("user enter valid email")
    public void user_enter_valid_email() {
        System.out.println("Inside Step - user enter valid email");
    }
    @When("user click button continue")
    public void user_click_button_continue() {
        System.out.println("Inside Step - user click button continue");
    }
    @When("user enter password")
    public void user_enter_password() {
        System.out.println("Inside Step - user enter password");
    }
    @When("user click button signIn")
    public void user_click_button_signIn() {
        System.out.println("Inside Step - user click button signIn");
    }
    @Then("user navigated to home page")
    public void user_navigated_to_home_page() {
        System.out.println("Inside Step - user navigated to home page");
    }

}
