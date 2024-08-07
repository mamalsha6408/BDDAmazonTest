package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;

public class SignInPage extends BaseClass {

    private By tf_email=By.id("ap_email");
    private By pf_password=By.id("ap_password");
    private By btn_continue=By.id("continue");
    private By btn_signin=By.id("signInSubmit");

    public void enterUserEmail(String email){
        driver.findElement(tf_email).sendKeys(email);
    }

    public void enterUserPassword(String password){
        driver.findElement(pf_password).sendKeys(password);
    }

    public void clickContinueButton(){
        driver.findElement(btn_continue).click();
    }

    public void clickSignInButton(){
        driver.findElement(btn_signin).click();
    }

    public void oneStepSignIn(String email,String password){
        driver.findElement(tf_email).sendKeys(email);
        driver.findElement(btn_continue).click();
        driver.findElement(pf_password).sendKeys(password);
        driver.findElement(btn_signin).click();
    }

}
