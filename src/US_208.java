import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_208 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
            System.out.println("Homepage URL verification successful");
        } else {
            System.out.println("Homepage URL verification unsuccessful");
        }

        WebElement loginLink = driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Email\"]")));

        usernameInput.sendKeys("oguzhanerdekli70@gmail.com");

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));

        passwordInput.sendKeys("Oguzhan_2007");

        try {
            System.out.println("Waiting for 2 seconds before clicking the 'Sign In' button");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

        if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful. Current URL: " + driver.getCurrentUrl());
        }

        WebElement AddToCart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"));
        AddToCart.click();

        WebElement ShoppingCart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a"));
        ShoppingCart.click();

        WebElement ApplyCoupon = driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[3]/input[2]"));
        ApplyCoupon.click();
        WebElement messageElement = driver.findElement(By.xpath("//div[@class='message']"));
        String messageText = messageElement.getText();
        if (messageText.equals("The coupon code you entered couldn't be applied to your order")) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement AddGiftCard = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]/div[3]/input[2]"));
        AddGiftCard.click();
        WebElement messageElement1 = driver.findElement(By.xpath("//div[@class='message']"));
        String messageText1 = messageElement1.getText();
        if (messageText1.equals("The coupon code you entered couldn't be applied to your order")) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement TOS = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
        TOS.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        Checkout.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement BillingContinue = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
        BillingContinue.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement ShippingContinue = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
        ShippingContinue.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement SelectMethod = driver.findElement(By.xpath("//*[@id=\"shippingoption_0\"]"));
        SelectMethod.click();

        WebElement ShippingContinue1 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
        ShippingContinue1.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement PaymentContinue = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
        PaymentContinue.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement PaymentContinue1 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
        PaymentContinue1.click();

        try {
            System.out.println("2 second interval");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement Confirm = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
        Confirm.click();

        driver.quit();
    }
}
