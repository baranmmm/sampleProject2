package newSample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPageElements{

    @FindBy(id = ":r0:")
    public WebElement emailTxt;

    @FindBy(id = "auth-login-v2-password")
    public WebElement passwordTxt;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginBtn;


}
