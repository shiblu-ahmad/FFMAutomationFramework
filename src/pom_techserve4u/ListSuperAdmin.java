package pom_techserve4u;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListSuperAdmin {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[1]/div[2]/div/ul/li[2]/div/ul/li[2]/a/span")
    WebElement superAdminList;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/a")
    WebElement addSuperAdminBtn;

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

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[17]/td[4]/button")
    WebElement deleteBtn;

    @FindBy(xpath = "/html/body/div[35]/div/div/div[3]/button[2]")
    WebElement okBtn;

    public ListSuperAdmin(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void sadminlist() {
        superAdminList.click();
    }

    public void registerSuperAdmin(String firstName, String lastName, String email, String password) {
        addSuperAdminBtn.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailAddressField.sendKeys(email);
        passwordField.sendKeys(password);
        regBtn.click();
    }

    public void deleteSuperAdmin() {
        deleteBtn.click();
        okBtn.click();

    }


}
