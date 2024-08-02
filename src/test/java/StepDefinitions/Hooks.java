package StepDefinitions;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void tearUp(){
        System.out.println("Inside Step - tear up");
    }

    @After
    public void tearDown(){
        System.out.println("Inside Step - tear down");
    }

    @AfterStep
    public void AfterTestStep(){
        System.out.println("Inside Step - after test");
    }


}
