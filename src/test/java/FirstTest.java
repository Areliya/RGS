import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver driver;
    private String site;

    @Before
    public void openSite(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        site = "https://www.rgs.ru/";
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get(site);
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//*[contains(text(),'ДМС')]"))));
//        System.out.println(driver.findElement(By.cssSelector("div:last-of-type")).isSelected());

//        WebElement element = driver.findElement(By.partialLinkText("ДМС"));
//        System.out.println(element.isSelected());;//*[contains(text(),'ДМС')]
    }

    @After
    public void closeSite(){
        driver.quit();
    }

//    public void waitAndClickElement (String xpath){
//        WebElement element = driver.findElement(By.partialLinkText(xpath));
//        element.click();
//    }
}
