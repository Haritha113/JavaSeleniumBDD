package StepDefs;

import Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {


    LoginPage loginPage = new LoginPage();

    @Then("dashboard should be available")
    public void dashboardShouldBeAvailable() {
        Assert.assertTrue(loginPage.isDashboardAvailable());
    }
    @When("user enters {string} and {string}")
    public void enterCredentials(String username,String password) {
        loginPage.enterValidCredentials(username,password);
    }
}
