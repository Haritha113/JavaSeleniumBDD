package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import Utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}

