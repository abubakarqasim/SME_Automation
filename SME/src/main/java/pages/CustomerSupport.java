package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerSupport {

    WebDriver driver;
    public CustomerSupport(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ClientSupport()
    {
        WebElement clientsupport = driver.findElement(By.cssSelector("body > app-root > app-landing-layout > div > div.contact-support"));
        clientsupport.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[1]/input"));
        clickname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement entername = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[1]/input"));
        entername.sendKeys("Abubakar");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicklastname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[2]/input"));
        clicklastname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enterlastname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[2]/input"));
        enterlastname.sendKeys("Qasim");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicknumber = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[3]/input"));
        clicknumber.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enternumber = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[3]/input"));
        enternumber.sendKeys("0387820827");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickemail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[4]/input"));
        clickemail.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enteremail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[4]/input"));
        enteremail.sendKeys("abubakarqasim2518@gmail.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement selectlang = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[5]/div/div[2]/p-radiobutton/div/div[2]"));
        selectlang.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicknext = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[2]/button[2]"));
        clicknext.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickok = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/div[2]/button"));
        clickok.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

    }
}
