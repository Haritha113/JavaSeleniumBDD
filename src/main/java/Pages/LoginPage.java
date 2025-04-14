package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage extends Base {

    WebDriver driver = new ChromeDriver();
    Base base = new Base();

    public boolean isDashboardAvailable() {

       return driver.findElement(By.className("oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module")).isDisplayed();

    }

    public void enterValidCredentials(String username, String password) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickOnLogin() {
        base.click("//button[@type='submit']");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
