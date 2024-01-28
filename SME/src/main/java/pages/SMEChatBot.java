package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SMEChatBot {
    WebDriver driver;

    public SMEChatBot(WebDriver driver)
    {
        this.driver = driver;
    }
    public void SMEChat()
    {
        WebElement clickchat = driver.findElement(By.cssSelector("#messageList > div"));
        clickchat.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickonchat = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/df-messenger//div/df-messenger-chat//div/df-messenger-user-input//div/div[2]/input"));
        clickonchat.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enterchat = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/df-messenger//div/df-messenger-chat//div/df-messenger-user-input//div/div[2]/input"));
        enterchat.sendKeys("Hi Abubakar Here ! How can i help you.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
    }



}
