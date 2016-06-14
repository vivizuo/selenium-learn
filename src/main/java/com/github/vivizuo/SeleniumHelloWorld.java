package com.github.vivizuo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelloWorld {

    public static void main(String[] args) {
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/wangwei/tools/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com/");

        driver.manage().window().maximize();

        /*
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");

        WebElement btn = driver.findElement(By.id("su"));
        btn.click();

        driver.close();*/
    }
}
