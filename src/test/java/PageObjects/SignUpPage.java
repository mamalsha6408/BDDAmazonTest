package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;

public class SignUpPage extends BaseClass {

    private By tf_name_su=By.id("ap_customer_name");
    private By tf_email_su=By.id("ap_email");
    private By pf_password_su=By.id("ap_password");
    private By pf_rpassword_su=By.id("ap_password_check");
    private By btn_continue_su=By.id("continue");

    public void enterName(String name){
        driver.findElement(tf_name_su).sendKeys(name);
    }

    public void enterEmail(String email){
        driver.findElement(tf_email_su).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(pf_password_su).sendKeys(password);
    }

    public void reEnterPassword(String password){
        driver.findElement(pf_rpassword_su).sendKeys(password);
    }

    public void clickContinue(){
        driver.findElement(btn_continue_su).click();
    }
}
