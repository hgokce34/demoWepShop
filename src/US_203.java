import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
    public class US_203 {
        @Test
        public void logOutTest() {


            WebDriver driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));
            WebElement logOutButton = driver.findElement(By.xpath("//a[@href='/logout']"));
            logOutButton.click();



            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login")) {
                System.out.println("Logged out successfully. Redirected to the login page.");
            } else {
                System.out.println("Logout failed. Not redirected to the login page.");
            }


            driver.quit();
        }
    }
