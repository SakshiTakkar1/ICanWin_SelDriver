package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class AppTestNew
{
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

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement elem = driver.findElement(By.id("select2-postform-expiration-container"));
        Thread.sleep(5000);

        System.out.println( new WebDriverWait(driver,Duration.ofMillis(5000)).until(ExpectedConditions.elementToBeClickable(elem)).isDisplayed());
        new WebDriverWait(driver,Duration.ofMillis(5000)).until(ExpectedConditions.elementToBeClickable(elem)).click();
        driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");

        driver.findElement(By.xpath("//button[text()='Create New Paste']")).click();

    }
}

