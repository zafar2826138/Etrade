package Pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id="USER")
    public WebElement userField;
    @FindBy(id="password")
        public WebElement passwordField;


}
