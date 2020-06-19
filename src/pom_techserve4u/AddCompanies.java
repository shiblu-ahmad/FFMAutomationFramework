package pom_techserve4u;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompanies {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/body/div/div[1]/div[2]/div/ul/li[4]/div/ul/li[3]/a/span")
    WebElement companyAdd;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[1]/input")
    WebElement companyNameField;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[2]/input")
    WebElement companyAddressField;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[3]/input")
    WebElement agreementFileField;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[4]/input")
    WebElement verificationFileField;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[5]/input")
    WebElement companyTINfield;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[1]/div[6]/div[3]/input")
    WebElement servicesList;

    @FindBy(xpath = "/html/body/div[1]/body/div/div[2]/div[2]/div/div/form/div[2]/div/button")
    WebElement submitBtn;

    public AddCompanies(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void addCompany(String companyName, String companyAddress, String agreementFile, String verficiationFile, int companyTIN) {
        companyAdd.click();
        companyNameField.sendKeys(companyName);
        companyAddressField.sendKeys(companyAddress);
        agreementFileField.sendKeys(agreementFile);
        verificationFileField.sendKeys(verficiationFile);
        companyTINfield.sendKeys(String.valueOf(companyTIN));
        servicesList.click();
        submitBtn.click();


    }


}
