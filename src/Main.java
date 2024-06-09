import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.event.KeyEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        //set môi trường browser
        System.setProperty("webdriver.edge.driver","D:\\Tester\\seleniumjav\\browserDriver\\edgedriver_win32\\msedgedriver.exe");
        //tạo object driver cho edge
        WebDriver driver = new EdgeDriver();
        //navigate tới website
        driver.navigate().to("https://www.google.com/");
        //mở full kích thước browser
        driver.manage().window().maximize();
        //click va thanh tìm kiếm và tìm kiếm facebook
        WebElement SearchBar = driver.findElement(By.id("APjFqb"));
        SearchBar.sendKeys("facebook");
        // Enter
        driver.findElement(By.id("APjFqb")).submit();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // Call the takeScreenshot function
//        driver.takeSnapShot("c://test.png");
//        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
//        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//        File destFile = new File(fileWithPath);
//        FileUtils.copyFile(srcFile, destFile);

    }
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
