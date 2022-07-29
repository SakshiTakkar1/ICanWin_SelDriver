package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AppTest
{
    /*
     * Rigorous Test :-)
     */
    @Test
    public void pasteBinTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi_Kumari\\IdeaProjects\\UITesting21july\\src\\test\\resources\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/ ");
        driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.id("postform-text"));
        searchField.sendKeys("Hello from WebDriver");
        Thread.sleep(6000);



       // WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        //submitButton.click();



//        WebElement searchField1 = driver.findElement(By.id("postform-name"));
//        searchField1.sendKeys("helloweb");


      //  WebElement exp = driver.findElement(By.id("select2-postform-status-container"));
       // WebElement x = new WebDriverWait(driver, Duration.ofMillis(10000)).until(ExpectedConditions.elementToBeClickable(exp));
        //x.click();

        WebElement elem = driver.findElement(By.id("select2-postform-expiration-container"));

      WebElement x = new WebDriverWait(driver, Duration.ofMillis(10000)).until(ExpectedConditions.elementToBeClickable(elem));
       //x.click();
        //driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();

//        Thread.sleep(3000);


        //Assert.assertTrue(searchField.isDisplayed(), "Search Field should be displayed");
        //Assert.assertTrue(searchField1.isDisplayed(), "Search Field should be displayed");


        //driver.close();
        //driver.quit();

    }
}
