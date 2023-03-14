package newSample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newSample.utilities.CommonSteps;
import newSample.utilities.ConfigurationReader;
import org.junit.Assert;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class LoginStepDefs extends CommonSteps {

    @Given("the user goes to examinion home page")
    public void the_user_goes_to_examinion_home_page() {
        driver.get(ConfigurationReader.get("url"));
    }
    @When("the user provides correct credentials")
    public void the_user_provides_correct_credentials() {
        loginPage.emailTxt.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordTxt.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginBtn.click();
    }
    @Then("the user should be able to login to the platform")
    public void the_user_should_be_able_to_login_to_the_platform() throws IOException {
//        waitForVisibility(dashboardPage.homeBtn, 10);
//        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        waitFor(1);
        BufferedImage expectedImage = readImageFile("weeklyProgressExpectedImage");
        BufferedImage actualImage = partialImageCreator("weeklyProgress", 385, 450, 690, 350);
        Assert.assertTrue(isSimilar(expectedImage,actualImage));
    }
}
