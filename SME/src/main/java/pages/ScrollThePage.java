package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollThePage {
    JavascriptExecutor scroller;
    public ScrollThePage(WebDriver driver) {
        scroller = ((JavascriptExecutor) driver);
    }
    public  void ScrollPage() throws InterruptedException {
        Thread.sleep(3000);

        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

    }
}
