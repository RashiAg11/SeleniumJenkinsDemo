package org.example.facebook;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class FacebookTest {
    WebDriver driver;
    String baseUrl;
    String email = "email";
    String password = "pass";
    String login = "login";
    String identifyLink ="//a[contains(@href,'identify')]";
    @BeforeClass

    public void setup() {
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();

    }
    @Test
    public void facebookTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.id(email)).sendKeys("testing@gmail.com");Thread.sleep(3000);
        driver.findElement(By.id(password)).sendKeys("testing");Thread.sleep(3000);
        driver.findElement(By.name(login)).click();
        Thread.sleep(3000);
        WebElement identifyLinkElement = driver.findElement(By.xpath(identifyLink));
        Assert.assertTrue(identifyLinkElement.isDisplayed());
        System.out.println("Find your account and log in");

    }
@AfterClass
public void tearDown(){
    System.out.println("Quit the Browser");
driver.quit();
}
}