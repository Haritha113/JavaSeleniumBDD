package stepdefinitions;

import Pages.BasePage;
import Pages.LogoutPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {

    WebDriver driver = DriverFactory.getDriver();
    LogoutPage logoutPage = new LogoutPage(driver);

    @When("user clicks on logout option")
    public void userClicksOnLogoutOption() {
        logoutPage.logout();
    }
}
