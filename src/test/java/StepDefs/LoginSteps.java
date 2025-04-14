package StepDefs;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {


    LoginPage loginPage = new LoginPage();


    @When("user enters {string} and {string}")
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
}
