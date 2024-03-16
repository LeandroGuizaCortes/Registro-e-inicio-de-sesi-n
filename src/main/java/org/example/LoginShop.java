package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginShop {
    public void loginShop(){

        System.setProperty("webdriver.edge.driver", "src/test/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("lerolero6@correo.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("PRUEBA123*");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

    }
}
