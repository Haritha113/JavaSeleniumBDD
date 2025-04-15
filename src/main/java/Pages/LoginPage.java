package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver); // this passes the WebDriver to BasePage
    }


    public void login(String url){
        driver.get(url);
    }

    public boolean isUserOnLoginPage(){
        return driver.findElement(By.className("orangehrm-login-branding")).isDisplayed();
    }

    public boolean isDashboardAvailable() {
       return driver.findElement(By.cssSelector("div.oxd-topbar-header-title")).isDisplayed();
    }

    public void enterValidCredentials(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernamel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernamel.sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickOnLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String checkForInvalidLogin(){
        return driver.findElement(By.xpath("//div[contains(@class,'oxd-alert-content oxd-alert-content--error')]//p")).getText();
    }
}
