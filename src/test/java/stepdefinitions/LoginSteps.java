package stepdefinitions;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);



    @When("^user enters (.*) and (.*)$")
    public void enterCredentials(String username,String password) {
        loginPage.enterValidCredentials(username,password);
    }

    @Then("User should see the dashboard for valid credentials")
    public void dashboardShouldBeAvailable() {
        Assert.assertTrue(loginPage.isDashboardAvailable());
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Given("hrm page is {string}")
    public void url(String url) {
        loginPage.login(url);
    }

    @Then("user should be logged out successfully")
    public void userShouldBeLoggedOutSuccessfully() {
        Assert.assertTrue(loginPage.isUserOnLoginPage());
    }

    @Then("^user should see prompt with text (.*)$")
    public void userShouldSeeErrormsg(String errorMsg) {
        Assert.assertEquals(loginPage.checkForInvalidLogin(),errorMsg);
    }
}
