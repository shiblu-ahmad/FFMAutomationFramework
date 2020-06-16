import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.LoginPage;
import pom.LogoutPage;

import java.util.concurrent.TimeUnit;

/*
 * Created a project
 * Added selenium jars
 * Added testNG jar
 * Created a package for POM
 * Created classes for each page add "all the elements" under POM package
 * Added testNG annotations and methods
 * Put assertion on login and logout method
 */

public class FFMLoginLogout {
    String baseUrl = "https://ffm.techserve4u.com/";
    String driverPath = "F:\\Selenium\\Driver\\geckodriver.exe";
    WebDriver driver;
    LoginPage objLogin;
    LogoutPage objLogout;

    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.gecko.driver", driverPath);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseUrl);

    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        objLogin = new LoginPage(driver);
        objLogin.setEmailField("superadmin@email.com");
        objLogin.setPassField("sadmin1122");
        objLogin.clickLoginBtn();
        System.out.println("Login Successfully");
        Thread.sleep(5000);
        //Assertion
        String loginActualAssertion = "Dashboard";
        WebElement loginExpectedAssertion = driver.findElement(By.xpath("/html/body/div[1]/body/div/div[1]/div[2]/div/ul/li[1]/a/span"));
        String getAssertionText = loginExpectedAssertion.getText();


        if (loginActualAssertion.equals(getAssertionText)) {
            System.out.println("Login Assertion Passed!");
        } else {
            System.out.println("Login Assertion Failed");
        }

    }

    @Test(priority = 2)
    public void logout() {
        objLogout = new LogoutPage(driver);
        objLogout.logOut();

    }

    @AfterTest
    public void quitBrowser() throws InterruptedException {
        String ffmActualPageTitle = driver.getTitle();
        String ffmExpectedTitle = "Field Force Management";
        Thread.sleep(5000);
        driver.quit();
        if (ffmActualPageTitle.equals(ffmExpectedTitle)) {
            System.out.println("Logout Assertion Passed!");
        } else {
            System.out.println("Logout Assertion Failed");
        }

    }

}
