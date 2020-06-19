package pom_techserve4u;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompanyAdmin {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[1]/div[2]/div/ul/li[5]/div/ul/li[3]/a/span")
    WebElement addCompanyAdmin;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[1]/input")
    WebElement firstNameField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[2]/input")
    WebElement lastNameField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[3]/input")
    WebElement userNameField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[4]/input")
    WebElement emailField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/div[5]/input")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[1]/div[2]/div/ul/li[5]/div/ul/li[3]/a/span")
    WebElement companyField;

    @FindBy(xpath = "//*[@id=\'kt_content\']/div/div/form/div[6]/select/option[12]")
    WebElement companyName;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/form/button")
    WebElement regBtn;

    public AddCompanyAdmin(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void registerCompanyAdmin(String firstName, String lastName, String userName, String email, String password) {

        addCompanyAdmin.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        userNameField.sendKeys(userName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        companyField.click();
        companyName.click();
        regBtn.click();

    }


}
