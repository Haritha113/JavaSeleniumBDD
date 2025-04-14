package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver(); // 🔥 Ensures Chrome is closed + driver is reset
    }
}
