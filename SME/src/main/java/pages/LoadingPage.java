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
