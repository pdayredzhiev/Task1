import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class FirstTest {
    public WebDriver driver;
    public WebDriverWait wait;
    @Test
    public void Test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gotse\\IdeaProjects\\FirstTask\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(presenceOfElementLocated(By.xpath("//button[@ng-click='customer()']"))).click();
        wait.until(presenceOfElementLocated(By.id("userSelect"))).click();

List<WebElement> allUsers = driver.findElements(By.xpath("//option[@class='ng-binding ng-scope'] "));
allUsers.get(1).click();

     wait.until(presenceOfElementLocated(By.xpath("//button[@class='btn btn-default']"))).click();
     wait.until(presenceOfElementLocated(By.xpath("//button[@class='btn btn-default']"))).click();
     wait.until(presenceOfElementLocated(By.xpath("//button[@ng-class='btnClass2']"))).click();
     wait.until(presenceOfElementLocated(By.xpath("//input[@type='number']"))).sendKeys("1000");
     wait.until(presenceOfElementLocated(By.xpath("//button[@type='submit']"))).click();
     wait.until(presenceOfElementLocated(By.xpath("//input[@type='number']"))).sendKeys("1000");
     wait.until(presenceOfElementLocated(By.xpath("//button[@type='submit']"))).click();


            WebElement Balance = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[2][@class='ng-binding']")));
            Assertions.assertEquals(Balance.getText(), "2000");

    }
}