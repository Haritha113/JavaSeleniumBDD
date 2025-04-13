package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends Base {

    WebDriver driver = new ChromeDriver();

    public boolean isDashboardAvailable() {

       return driver.findElement(By.className("oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module")).isDisplayed();

    }

    public void enterValidCredentials(String username, String password) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
}
