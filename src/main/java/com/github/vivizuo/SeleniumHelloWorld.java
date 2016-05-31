package com.github.vivizuo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHelloWorld {

    public static void main(String[] args) {
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
        System.setProperty("webdriver.chrome.driver", "E:/web/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com/");

        driver.manage().window().maximize();

        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");

        WebElement btn = driver.findElement(By.id("su"));
        btn.click();

        driver.close();
    }
}
