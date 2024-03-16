package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Registro {
    public  void realizarRegistro() {

        System.setProperty("webdriver.edge.driver", "src/test/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Lerolero6");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("lerolero6@correo.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PRUEBA123*");
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Don");
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Cangrejo");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Avenida Siempre Vida 123");
        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Colorado");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Colorado");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("730001");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("01800999");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();

        }
    }