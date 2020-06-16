package basicWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FFMBasicAutomation {


    public static void main(String[] args) throws InterruptedException {


        // start @test which activiates to run the new class besides the main class
        WebDriver driver;
        String baseUrl;


        // write your code here
        System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://ffm.techserve4u.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);


        //Find the email field and pass the email address
        WebElement emailField = driver.findElement(By.id("login"));
        emailField.sendKeys("superadmin@email.com");
        System.out.println("Send Data to Email Field");
        //Find the password field and pass the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("sadmin1122");
        System.out.println("Send Data to Password Field");
        //Click on the login button to login the panel
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/input[3]"));
        loginBtn.click();
        System.out.println("Clicked on Login Button");
        System.out.println("Successfully Logged In");

        //Assertion
        String loginActualAssertion = "Dashboard";
        WebElement loginExpectedAssertion = driver.findElement(By.xpath("/html/body/div[1]/body/div/div[1]/div[2]/div/ul/li[1]/a/span"));
        String getAssertionText = loginExpectedAssertion.getText();


        if (loginActualAssertion.equals(getAssertionText)) {
            System.out.println("Login Assertion Passed!");
        } else {
            System.out.println("Login Assertion Failed");
        }

        //Click on the superadmin dropdown
        WebElement superAdmindd = driver.findElement(By.xpath("//*[@id=\"dropdown-basic-button\"]"));
        superAdmindd.click();

        System.out.println("Clicked on dropdown for logout");
        //Click on logout
        WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/body/div/div[2]/div[1]/div[2]/div/div/div/a[2]"));
        logout.click();

        System.out.println("Clicked on logout");
        System.out.println("Logged Out Successfully");

        //Assertion
        String ffmActualPageTitle = driver.getTitle();
        String ffmExpectedTitle = "Field Force Management";

        if (ffmActualPageTitle.equals(ffmExpectedTitle)) {
            System.out.println("Logout Assertion Passed!");
        } else {
            System.out.println("Logout Assertion Failed");
        }


        Thread.sleep(3000);

        driver.quit();


    }
}









