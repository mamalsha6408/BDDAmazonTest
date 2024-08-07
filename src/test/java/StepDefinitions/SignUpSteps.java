package StepDefinitions;

import PageObjects.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class SignUpSteps extends BaseClass {

    @Given("the user is in amazon user signUp page")
    public void the_user_is_in_amazon_user_sign_up_page() {
        signUpPage=new SignUpPage();
        driver.get(properties.getProperty("user_SignUp_url"));
    }

    @When("the user enter valid name")
    public void the_user_enter_valid_name() {
        signUpPage.enterName(properties.getProperty("ur_name"));
    }

    @When("the user enter valid email")
    public void the_user_enter_email() {
        signUpPage.enterEmail(properties.getProperty("ur_email"));
    }

    @When("the user enter valid password")
    public void the_user_enter_valid_password() {
        signUpPage.enterPassword(properties.getProperty("ur_password"));
    }

    @When("the user re enter valid password")
    public void the_user_re_enter_valid_password() {
        signUpPage.reEnterPassword(properties.getProperty("ur_password"));
    }

    @When("the user click continue button")
    public void the_user_click_continue_button() {
        //signUpPage.clickContinue();
    }

    @Then("the user should navigated to next page")
    public void the_user_should_navigated_to_next_page() {
        System.out.println("navigated to next page");
    }


}
