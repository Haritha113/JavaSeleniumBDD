package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserMangmntPage extends BasePage {

    public UserMangmntPage(WebDriver driver) {
        super(driver);
    }

    public void addUser() {
        driver.findElement(By.xpath("//button//i[starts-with(@class,'oxd-icon bi-plus')]")).click();
    }

    public void navigateToTab(String tabname) {
        driver.findElement(By.xpath("//span[text()='" + tabname + "']")).click();
    }


    public String switchedToTab(String tabname) {
       return driver.findElement(By.xpath("//div[contains(@class,'oxd-topbar-header-title')]//h6[1]")).getText();
    }

    public void submitUserData() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
