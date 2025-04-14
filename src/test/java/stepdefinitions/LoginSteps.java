package stepdefinitions;

import Pages.Base;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {


    private static LoginPage loginPage = new LoginPage();



    @When("^user enters (.*) and (.*)$")
    public void enterCredentials(String username,String password) {
        loginPage.enterValidCredentials(username,password);
    }


    @Then("User should see the dashboard for valid credentials")
    public void dashboardShouldBeAvailable() {
        Assert.assertTrue(loginPage.isDashboardAvailable());
        loginPage.closeBrowser();
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Given("url is {string}")
    public void url(String string) {
        loginPage.login(string);
    }
}
