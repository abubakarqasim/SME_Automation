package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
    WebDriver driver;
    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }
    public void ContactWithUs()
    {
        WebElement clickcontactname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[3]/div/input"));
        clickcontactname.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement entercontactname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[3]/div/input"));
        entercontactname.sendKeys("Abubakar Qasim");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickfunction = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[4]/div/input"));
        clickfunction.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement sendfunction = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[4]/div/input"));
        sendfunction.sendKeys("SME-In a Box");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickemail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[5]/div/input"));
        clickemail.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement sendemail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[5]/div/input"));
        sendemail.sendKeys("abubakarqasim2518@gmail.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clcikcountrycode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[6]/div/div/span/p-dropdown/div/div[2]/span"));
        clcikcountrycode.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement selectcountrycode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[6]/div/div/span/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li/div/div"));
        selectcountrycode.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicknumber = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[6]/div/div/input"));
        clicknumber.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement sendnumber = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[6]/div/div/input"));
        sendnumber.sendKeys("0387820827");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickmessage = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[7]/div/textarea"));
        clickmessage.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement sendmessage = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[7]/div/textarea"));
        sendmessage.sendKeys("Hi ! Welcome to the SME In a Box");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicksend = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-contact-us/div[2]/div/div[3]/div[1]/form/div/div[9]/button"));
        clicksend.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();

        }





    }

}
