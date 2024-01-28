package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeepInTouch {
    WebDriver driver;

    public KeepInTouch(WebDriver driver) {
        this.driver = driver;

    }

    public void KeepinTouch()
    {
        WebElement clickkeepintouch = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-landing/app-banners-section/div/div/div/div/div/a[2]"));
        clickkeepintouch.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickcompanyname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[1]/div/input"));
        clickcompanyname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement entercompanyname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[1]/div/input"));
        entercompanyname.sendKeys("SME Telma");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clcikbusinesstype = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[2]/div/input"));
        clcikbusinesstype.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enterbusinesstype = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[2]/div/input"));
        enterbusinesstype.sendKeys("Fin-Tech");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

    }
}
