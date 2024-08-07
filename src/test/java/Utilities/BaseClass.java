package Utilities;

import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriverWait wait;

    public static FileInputStream fi;
    public static Properties properties;

    public static SignInPage signInPage;
    public static SignUpPage signUpPage;

    public static void setupDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        }
    }

    public static void tearDownDriver(){
        if(driver!=null){
            driver=null;
        }
    }

    public void setupPropertiesFiles() throws IOException {
        fi=new FileInputStream("src/test/resources/testData.properties");
        properties=new Properties();
        properties.load(fi);
    }



}
