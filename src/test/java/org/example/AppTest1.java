package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppTest1 {

    @Test
    public void ICanWin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement newpaste = driver.findElement(By.name("PostForm[text]"));
        newpaste.sendKeys("Hello from WebDriver");
        Thread.sleep(2000);
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");

        WebElement elem = driver.findElement(By.id("select2-postform-expiration-container"));

        new WebDriverWait(driver, Duration.ofMillis(50000)).until(ExpectedConditions.elementToBeClickable(elem)).click();


        WebElement tenMins = driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]"));
        new Actions(driver).moveToElement(tenMins).click().build().perform();

        //driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();
    }
}
