package basicWebAutomation;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FFMTestNG {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://ffm.techserve4u.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("superadmin@email.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("sadmin1122");
        driver.findElement(By.xpath("//input[@value='Log In ']")).click();
        driver.findElement(By.xpath("//body")).click();
        driver.findElement(By.xpath("//div[@id='kt_aside_menu']/ul/li[2]/div/ul/li[3]/a/span")).click();
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Pranto");
        driver.findElement(By.name("lastName")).click();
        driver.findElement(By.name("lastName")).clear();
        //  driver.findElement(By.name("lastName")).sendKeys("");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("");
        String validationMessage = lastName.getAttribute("validationMessage");


        boolean required = Boolean.parseBoolean(lastName.getAttribute("required"));

        boolean valid = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].validity.valid;", lastName);
        if (required) {
            //element is required and validation error will popup if the field is empty.
        }

        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("pranto.mazumder@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1Bismilla");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }





}
