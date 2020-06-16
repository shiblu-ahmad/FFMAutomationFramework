package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "login")
    WebElement loginField;

    @FindBy(id = "password")
    WebElement passField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/input[3]")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {

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


}
