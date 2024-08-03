package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriverWait wait;

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



}
