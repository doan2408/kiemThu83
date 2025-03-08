package com.example.nguyenbadoan_ph54672;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class Selemium {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void signIn() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[normalize-space()='Sign In Portal']")).click();
        driver.findElement(By.id("usr")).sendKeys("sa");
        driver.findElement(By.id("pwd")).sendKeys("sa");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.quit();
    }
}
