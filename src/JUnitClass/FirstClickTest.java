package JUnitClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This code clicks on the Login button

public class FirstClickTest{
    String baseURL;
    WebDriver driver;
    @BeforeEach
    void init() {
        baseURL = "https://hr-testing.buffsci.org/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Berdi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("Navigated to given URL");
    }
    @Test
    void adminTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/a")).click();
        Thread.sleep(1000);
        System.out.println("@Test – clicked on the element.");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@staging-buffsci.org");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin123test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app-layout\"]/div/div/div/div/div[2]/form/div[4]/div/button")).click();
        Thread.sleep(2000);
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/input"));
        nameField.sendKeys("Abigail Ellis");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"78971\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"basic-tab\"]/div/div[1]/div/button")).click();
        Thread.sleep(2000);
        WebElement status = driver.findElement(By.xpath(" //*[@id=\"basicInfoForm\"]/div/div[1]/select"));
        status.sendKeys("Active");
        Thread.sleep(2000);
        System.out.println("@Test2 - performed operation with objects");
        Thread.sleep(1000);
    }
    @AfterEach
    void done() {
        driver.quit();
        System.out.println("Closed browser session");
    }
}

