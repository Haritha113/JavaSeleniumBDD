package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class UserMangmntPage extends BasePage {

    public UserMangmntPage(WebDriver driver) {
        super(driver);
    }

    public void addUser() {
        driver.findElement(By.xpath("//button//i[starts-with(@class,'oxd-icon bi-plus')]")).click();
    }

    public void navigateToTab(String tabname) {
        driver.findElement(By.xpath("//span[text()='" + tabname + "']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }


    public String switchedToTab(String tabname) {
       return driver.findElement(By.xpath("//div[contains(@class,'oxd-topbar-header-title')]//h6[1]")).getText();
    }

    public void submitUserData() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public String addUserDetailsAndReturnEmpName(String role, String status, String generatedEmpName, String generatedUsername, String generatedPassword) {
        driver.findElement(By.xpath("//label[text()='User Role']//..//..//..//div[contains(@class,'oxd-select-wrapper')]")).click();
       System.out.println(role);
        driver.findElement(By.xpath("//span[text()='"+ role +"'")).click();

        WebElement element = driver.findElement(By.xpath("//label[text()='Username']//..//..//..//input[contains(@class,'oxd-input oxd-input--active')]"));
        element.click();
        element.sendKeys(generatedUsername);


        driver.findElement(By.xpath("//label[text()='Status']//..//..//..//div[contains(@class,'oxd-select-wrapper')]")).click();
        driver.findElement(By.xpath("//span[text()='"+ status +"'")).click();

        WebElement empName = driver.findElement(By.xpath("//label[text()='Employee Name']//..//..//..//div[contains(@class,'oxd-autocomplete-wrapper')]"));
        empName.sendKeys(generatedEmpName);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement firstOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='listbox']//div[@class='oxd-autocomplete-option'][1]")
        ));
        firstOption.click();

        WebElement password = driver.findElement(By.xpath("//label[text()='Password']//..//..//..//input[contains(@class,'oxd-input oxd-input--active')]"));
        password.click();
        password.sendKeys(generatedPassword);

        WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']//..//..//..//input[contains(@class,'oxd-input oxd-input--active')]"));
        confirmPassword.click();
        confirmPassword.sendKeys(generatedPassword);

        return empName.getText();


    }

    public void validateUserInTable(String generatedUsername, String generatedEmpName, String role) {
        List<WebElement> rows = driver.findElements(By.xpath("//div[@role='rowgroup']/div[contains(@class, 'oxd-table-row')]"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class, 'oxd-table-cell')]"));
            if (cells.size() > 1) {
                String cellText = cells.get(1).getText().trim(); // Assuming username is column 2
                if (cellText.equals(generatedUsername)) {
                    System.out.println("Found user row:");
                    for (WebElement cell : cells) {
                        System.out.println(" → " + cell.getText());
                    }
                    break;
                }
            }
        }


    }
}
