package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsServices {
    WebDriver driver;
    public ProductsServices(WebDriver driver) {
        this.driver = driver;
    }

    public void ProductandServices()
    {
        WebElement clickproductsandservices = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/div/div[2]/div[2]/div/a[1]"));
        clickproductsandservices.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
            //Hi
        }
    }


}
