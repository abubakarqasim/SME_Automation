package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckEligibility {
    WebDriver driver;
    public CheckEligibility(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckEligibility()
    {
        WebElement selectlocation = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[11]/div[2]/button"));
        selectlocation.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clciknextlocation = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[11]/div[2]/button"));
        clciknextlocation.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
            //Hi
        }
    }
}
