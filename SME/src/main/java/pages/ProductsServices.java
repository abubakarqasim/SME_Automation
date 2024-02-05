package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsServices {
    WebDriver driver;
    JavascriptExecutor scroller;
    public ProductsServices(WebDriver driver) {
        this.driver = driver;
        scroller = ((JavascriptExecutor) driver);
    }



    public  void ProductandServices() throws InterruptedException {
        WebElement clickproductsandservices = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/div/div[2]/div[2]/div/a[1]"));
        clickproductsandservices.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        scroller.executeScript("window.scrollTo(0, 300);");
        Thread.sleep(3000);
        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
        scroller.executeScript("window.scrollTo(0, -300);");
        Thread.sleep(3000);
        scroller.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(7000);
    }


}
