package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogoutPage {
    WebDriver driver;
    @FindBy(id = "login")
    WebElement loginField;

    @FindBy(id = "password")
    WebElement passField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/input[3]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"dropdown-basic-button\"]")
    WebElement logoutDropDown;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[1]/div[2]/div/div/div/a[2]")
    WebElement logOut;


    public LogoutPage(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void setEmailField(String email) {
        loginField.sendKeys(email);

    }

    public void setPassField(String password) {
        passField.sendKeys(password);

    }

    public void clickLoginBtn() {
        loginBtn.click();

    }

    public void logOut() {
        logoutDropDown.click();
        logOut.click();
        System.out.println("Logout Successfully");
        //Verify home page


    }


}
