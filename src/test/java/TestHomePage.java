import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TestHomePage {

    System.setProperty("webdriver.chrome.driver", "d://projects/chromedriver.exe");
WebDriver driver= new ChromeDriver();


    public void HomePage () {

driver.get("https://www.amazon.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
        WebElement textWindow = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
textWindow.sendKeys("dress\n");
        ///Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/s?k=dress&ref=nb_sb_noss ");

driver.quit();

    }





}
