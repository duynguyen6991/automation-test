package HRMsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginHRM {
    WebDriver driver;
    @Test
    public void setUp() throws Exception {
        System.setProperty("webdriver.edge.driver", "D:\\Tester\\seleniumjav\\browserDriver\\edgedriver_win32\\msedgedriver.exe");
        //tạo object driver cho edge
        driver = new EdgeDriver();
        //navigate tới website
        driver.navigate().to("https://hrm.anhtester.com/");
        //mở full kích thước browser
        driver.manage().window().maximize();

        //lâấy url trước khi đăng nhập
        System.out.println(driver.getCurrentUrl());

        //đăng nhập
        driver.findElement(By.id("iusername")).sendKeys("admin_example");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//i[@class='fas fa-user-lock d-blockd']")).submit();

        //tạo object wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //wait đến khi nut1 logout click được
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-smb btn-outline-primary rounded-pill']")));

        //in url sau khi đăng nhập
        System.out.println(driver.getCurrentUrl());
    }
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
