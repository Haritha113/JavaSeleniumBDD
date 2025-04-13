package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    WebDriver driver = new ChromeDriver();

    public void login(String url){
        driver.get(url);
    }

    public void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }






}
