package pom_techserve4u;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListCompanyAdmin {
    WebDriver driver;


    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[1]/div[2]/div/ul/li[5]/div/ul/li[2]/a/span")
    WebElement listCompanyAdmin;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[31]/td[5]/button")
    WebElement deleteBtn;

    @FindBy(xpath = "/html/body/div[1]/div/body/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/a")
    WebElement addCompanyAdminBtn;


    public ListCompanyAdmin(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void setListCompanyAdmin() {
        listCompanyAdmin.click();
    }

    public void setDeleteBtn() {
        deleteBtn.click();
    }

    public void setAddCompanyAdminBtn() {
        addCompanyAdminBtn.click();
    }


}
