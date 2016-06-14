package com.github.vivizuo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TaobaoLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wangwei/tools/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.taobao.com/");
        driver.manage().window().maximize();
        WebElement loginBox = driver.findElement(By.id("J_LoginBox"));
        String classes = loginBox.getAttribute("class");
        System.out.println("classes: " + classes);
        if (classes.contains("module-static")) {
            System.out.println("标准登录");
        } else if (classes.contains("module-quick")) {
            System.out.println("快速登录");
            WebElement static2Quick = driver.findElement(By.className("login-switch"));
            static2Quick.click();
        }
        WebElement usernameText = driver.findElement(By.name("TPL_username"));
        usernameText.sendKeys("123");
        WebElement passwordText = driver.findElement(By.name("TPL_password"));
        passwordText.sendKeys("123");
        WebElement loginButton = driver.findElement(By.id("J_SubmitStatic"));
        loginButton.click();
        System.out.println("cookies: " + driver.manage().getCookies());
        //driver.close();
    }
}
