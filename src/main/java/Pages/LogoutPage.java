package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage extends BasePage{


    public LogoutPage(WebDriver driver){
        super(driver);
    }

    BasePage basePage = new BasePage(driver);

    public void logout(){
        WebElement webElement = driver.findElement(By.linkText("/web/index.php/auth/logout"));
        basePage.click(webElement);
    }
}
