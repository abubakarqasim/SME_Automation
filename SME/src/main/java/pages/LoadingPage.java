package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class LoadingPage {
    JavascriptExecutor scroller;
    public LoadingPage(WebDriver driver)
    {
        scroller = ((JavascriptExecutor) driver);


    }

    public  void LandingPage() throws InterruptedException {
        Thread.sleep(10000);

        scroller.executeScript("window.scrollTo(0, 300);");
        Thread.sleep(2000);
        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        Thread.sleep(1000);
        scroller.executeScript("window.scrollTo(0, -300);");
        Thread.sleep(2000);
        scroller.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(7000);
    }
}
