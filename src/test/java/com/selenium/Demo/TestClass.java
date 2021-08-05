package com.selenium.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test (priority = 2)
    public void chromeTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver wb= new ChromeDriver();
        wb.get("https://www.google.com");
        String title = wb.getTitle();
        Assert.assertEquals(title, "Google");
        wb.close();
    }
    @Test (priority = 1)
    public void firefoxTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
        WebDriver wb = new FirefoxDriver();
        wb.get("https://www.google.com");
        String title = wb.getTitle();
        Assert.assertEquals(title, "Google");
        wb.close();
    }
}
