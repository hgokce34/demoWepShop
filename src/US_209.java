import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_209 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testOrderHistoryAndDownloadInvoice() throws InterruptedException {
        // Log in
        driver.findElement(By.xpath("<a href=\"/login\" class=\"ico-login\">Log in</a>")).click();
        driver.findElement(By.id("Email")).sendKeys("h.techno@tester.com");
        driver.findElement(By.id("Password")).sendKeys("Ht0002000");


        // Navigate to "My Account"
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("<a href=\"/customer/info\" class=\"account\">h.techno@tester.com</a>"))).click();

        // Go to "Orders"
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("<a href=\"/customer/orders\">Orders</a>"))).click();

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[1]/td[1]/a"))).click();

        // Download the invoice

        //WebElement downloadInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Download invoice')]")));
        // downloadInvoiceButton.click();

        // Additional steps might be required here to handle the file download process depending on the browser settings
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

