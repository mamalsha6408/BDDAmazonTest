package StepDefinitions;

import PageObjects.SignInPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SignInSteps extends BaseClass {

    @Given("user in amazon sign in page")
    public void user_in_amazon_sign_in_page() {
        System.out.println("Inside Step - user in amazon sign in page");
        signInPage=new SignInPage();
        driver.get(properties.getProperty("user_signIn_url"));

    }

    @Given("user enter valid email")
    public void user_enter_valid_email() {
        System.out.println("Inside Step - user enter valid email");
        //driver.findElement(By.id("ap_email")).sendKeys("mamalsha6408@gmail.com");
        //signInPage.enterUserEmail("mamalsha6408@gmail.com");
        signInPage.enterUserEmail(properties.getProperty("un"));
    }

    @When("user click button continue")
    public void user_click_button_continue() {
        System.out.println("Inside Step - user click button continue");
        //driver.findElement(By.id("continue")).click();
        signInPage.clickContinueButton();
    }

    @When("user enter password")
    public void user_enter_password() {
        System.out.println("Inside Step - user enter password");
        //driver.findElement(By.id("ap_password")).sendKeys("nanjulaTest1234");
        //signInPage.enterUserPassword("nanjulaTest1234");
        signInPage.enterUserPassword(properties.getProperty("pw"));
    }

    @When("user click button signIn")
    public void user_click_button_signIn() {
        System.out.println("Inside Step - user click button signIn");
        //driver.findElement(By.id("signInSubmit")).click();
        signInPage.clickSignInButton();
    }

    @Then("user navigated to home page")
    public void user_navigated_to_home_page() {
        System.out.println("Inside Step - user navigated to home page");
        Assert.assertEquals("home",driver.getTitle());
    }


}
