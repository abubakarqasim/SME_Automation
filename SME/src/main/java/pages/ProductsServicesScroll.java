package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductsServicesScroll {
    JavascriptExecutor scroller;
    WebDriver driver;

    public ProductsServicesScroll(WebDriver driver) {
        this.driver = driver;
        scroller = ((JavascriptExecutor) driver);
    }

    public  void ScrollDown() throws InterruptedException {
        Thread.sleep(10000);

        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(10000);

    }
    public  void ScrollUp() throws InterruptedException {
        Thread.sleep(10000);
        scroller.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(10000);
    }



}

//ProductsProductsServicesScroll

