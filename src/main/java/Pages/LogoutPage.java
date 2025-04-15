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
        WebElement element = driver.findElement(By.cssSelector("p.oxd-userdropdown-name"));
        basePage.click(element);
        WebElement webElement = driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']"));
        basePage.click(webElement);
    }
}
