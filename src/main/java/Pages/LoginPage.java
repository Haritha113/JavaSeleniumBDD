package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends Base {

    WebDriver driver = new ChromeDriver();
    Base base = new Base();

    public void login(String url){
        base.login(url);
    }

    public boolean isDashboardAvailable() {

       return driver.findElement(By.className("oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module")).isDisplayed();

    }

    public void closeBrowser(){
        driver.quit();
    }

    public void enterValidCredentials(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernamel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernamel.sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickOnLogin() {
        base.click("//button[@type='submit']");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
