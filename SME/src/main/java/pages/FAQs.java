package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQs {
    WebDriver driver;
    JavascriptExecutor scroller;
    public FAQs(WebDriver driver) {
        this.driver = driver;
        scroller = ((JavascriptExecutor) driver);
    }

    public  void FAQsSection() throws InterruptedException {
        WebElement clickfaqs = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/div/div[1]/div[2]/div/a[1]"));
        clickfaqs.click();
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
        Thread.sleep(5000);
    }

}
