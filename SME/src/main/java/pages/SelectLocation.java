package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelectLocation {
    WebDriver driver;
    JavascriptExecutor scroller;

    public SelectLocation(WebDriver driver) {
        this.driver = driver;
        scroller = ((JavascriptExecutor) driver);
    }

    public void LocationSeletion() throws InterruptedException {
        Thread.sleep(3000);

        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
    }
}
