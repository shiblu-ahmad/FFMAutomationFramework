package pom_techserve4u;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSuperAdmin {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/body/div/div[1]/div[2]/div/ul/li[2]/div/ul/li[3]/a/span")
    WebElement createSuperAdmin;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[1]/input")
    WebElement firstNameField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[2]/input")
    WebElement lastNameField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[3]/input")
    WebElement emailAddressField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[4]/input")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/button")
    WebElement regBtn;


    public AddSuperAdmin(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void setCreateSuperAdmin() {
        createSuperAdmin.click();

    }

    public void registerSuperAdmin(String firstName, String lastName, String email, String password) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailAddressField.sendKeys(email);
        passwordField.sendKeys(password);
        regBtn.click();
    }


}
