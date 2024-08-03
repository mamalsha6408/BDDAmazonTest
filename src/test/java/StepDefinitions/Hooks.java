package StepDefinitions;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void tearUp(){
        setupDriver();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
        tearDownDriver();
    }

    @AfterStep
    public void AfterTestStep(){
        System.out.println("Inside Step - after test");
    }


}
