package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class testng {
    WebDriver driver;
    @Test//set môi trường browser
    public void setup(){

        System.setProperty("webdriver.edge.driver","D:\\Tester\\seleniumjav\\browserDriver\\edgedriver_win32\\msedgedriver.exe");
        //tạo object driver cho edge
        driver = new EdgeDriver();
        //navigate tới website
        driver.navigate().to("https://www.google.com/");
        //mở full kích thước browser
        driver.manage().window().maximize();
        //click va thanh tìm kiếm và tìm kiếm facebook
        WebElement SearchBar = driver.findElement(By.id("APjFqb"));
        SearchBar.sendKeys("facebook");
        // Enter
        driver.findElement(By.id("APjFqb")).submit();
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
