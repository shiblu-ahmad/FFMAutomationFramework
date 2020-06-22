package techserve4u_Web_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pom_techserve4u.AddCompanies;
import pom_techserve4u.LoginPage;

import java.util.concurrent.TimeUnit;

public class FFMAddCompany {
    WebDriver driver;
    AddCompanies objAddCompany;
    LoginPage objLogin;


    String baseUrl = "https://ffm.techserve4u.com/";
    String driverPath = "F:\\Selenium\\Driver\\geckodriver.exe";

    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.gecko.driver", driverPath);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseUrl);
    }

    @org.testng.annotations.Test(priority = 1)
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


    @org.testng.annotations.Test(priority = 2)
    public void AddCompany() throws InterruptedException {

        objAddCompany = new AddCompanies(driver);
        objAddCompany.addCompany("Pranto Company12", "Dhaka,Bangladesh", "E:\\FFM\\Upload PDF file\\TERM-PAPER-EXAMPLE.pdf",
                "E:\\FFM\\Upload PDF file\\TERM-PAPER-EXAMPLE.pdf", 321321);
        Thread.sleep(5000);

        //Assertion
        String companyListActualAssertion = "Company List";
        WebElement loginExpectedAssertion = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3"));
        String getAssertionText = loginExpectedAssertion.getText();


        if (loginExpectedAssertion.equals(getAssertionText)) {
            System.out.println("Add Company Assertion Passed!");
        } else {
            System.out.println("Add Company Assertion Failed");

        }

    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }
}
