import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {
    @Test
    public void testGetSum() {

        System.setProperty("webdriver.chrome.driver", "d://projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://www.browserstack.com/users/sign_in");

            WebElement userFullName = driver.findElement(By.id("user_full_name"));
            WebElement username = driver.findElement(By.id("user_email_login"));
            WebElement password = driver.findElement(By.id("user_password"));
            WebElement login = driver.findElement(By.name("commit"));
            //WebElement checkBox = driver.findElement(By.id("tnc_checkbox"));

            username.sendKeys("abc@gmail.comm");
            password.sendKeys("your_passwordss");
            WebElement error = driver.findElement(By.className("bs-alert-text "));
            //  userFullName.sendKeys("Alex");
            //checkBox.click();
            login.click();
        } finally {
            driver.quit();
        }


        ////String actualUrl = "https://live.browserstack.com/dashboard";
        ////String expectedUrl = driver.getCurrentUrl();

        ///Assert.assertEquals(error.getText(), "There have been several failed attempts to sign in from this account. Please wait a while and try again later.");


        //   int result;
        //   result = Main.getSum(10,10);
        //    Assert.assertEquals(result, 20);


        //    result = Main.getSum(0,0);
        //   Assert.assertEquals(result, 0);

        //  result = Main.getSum(-10,-10);
        //  Assert.assertEquals(result, -20);

        // result = Main.getSum(-10,10);
        // Assert.assertEquals(result, 0);

        // check the password page
    }

    @Test
    public void testNewPassword() {

        System.setProperty("webdriver.chrome.driver", "d://projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://www.browserstack.com/users/sign_in");

            WebElement link = driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[11]/div/a[2]"));

            link.click();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/password/new");


        } finally {
            driver.close();
        }

    }

}




