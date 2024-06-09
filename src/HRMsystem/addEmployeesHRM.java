package HRMsystem;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
public class addEmployeesHRM {
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

        //đăng nhập
        driver.findElement(By.id("iusername")).sendKeys("admin_example");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//i[@class='fas fa-user-lock d-blockd']")).submit();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath( f"//li[@class='pc-item active']//a[contains(@class,'pc-link')]")));
        WebElement navBar = driver.findElement(By.xpath("/html/body/nav/div/div/ul"));
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", navBar);
//        driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(-100, 0).perform();
//        js.executeScript("window.scrollTo(0,200)");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Employees']")));
//        driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();
        {
            WebElement element = driver.findElement(By.id("mobile-collapse"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
            System.out.println("đã tơi đây");
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".pc-item:nth-child(11) .pc-mtext")).click();
        driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.name("first_name")).click();
        driver.findElement(By.name("first_name")).sendKeys("duy");
        driver.findElement(By.name("last_name")).click();
        driver.findElement(By.name("last_name")).sendKeys("nguyen");
        driver.findElement(By.name("employee_id")).click();
        driver.findElement(By.name("contact_number")).click();
        driver.findElement(By.name("contact_number")).sendKeys("0990099887");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("duynguyen6777@mlai.oc");
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("duyndt1");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("daoobb");
        driver.findElement(By.cssSelector("#select2-office_shift_id-ty-container > .select2-selection__placeholder")).click();
        driver.findElement(By.id("select2-role-g2-container")).click();
        driver.findElement(By.cssSelector("#select2-department_id-container > .select2-selection__placeholder")).click();
        driver.findElement(By.id("select2-department_id-container")).click();
        driver.findElement(By.id("select2-designation_id-zr-container")).click();
        driver.findElement(By.name("basic_salary")).click();
        driver.findElement(By.name("basic_salary")).sendKeys("10000");
        driver.findElement(By.name("hourly_rate")).click();
        driver.findElement(By.name("hourly_rate")).sendKeys("0100");
        driver.findElement(By.id("select2-salay_type-container")).click();
        driver.findElement(By.cssSelector(".btn:nth-child(2) > .ladda-label")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".ladda-button:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.name("file")).click();
        driver.findElement(By.name("file")).sendKeys("C:\\fakepath\\wp11689644-alejandro-garnacho-wallpapers.jpg");
        driver.findElement(By.name("file")).click();
        driver.findElement(By.cssSelector(".btn:nth-child(2) > .ladda-label")).click();

        System.out.println("driver.switchTo().alert().getText()");
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
