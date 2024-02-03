package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigureYourSolution {
    WebDriver driver;
    JavascriptExecutor scroller;
    public ConfigureYourSolution( WebDriver driver) {
        this.driver = driver;
        scroller = ((JavascriptExecutor) driver);
    }

    public void ConfigureSolution() throws InterruptedException {
        Thread.sleep(3000);

        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
    }

    public void SolutionConfiguration()
    {
        WebElement ValidateBox = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-preview-your-package/div/div/div[2]/div/div[3]/div/div[3]/div[4]/div[2]/button"));
        ValidateBox.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement ClickCIN = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[3]/div/input"));
        ClickCIN.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement EnterCIN = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[3]/div/input"));
        EnterCIN.sendKeys("12345");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement IssueDate = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[4]/div/input"));
        IssueDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement EnterIssueDate = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[4]/div/input"));
        EnterIssueDate.sendKeys("05022024");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement EndDate = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[5]/div/input"));
        EndDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement EnterEndDate = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[5]/div/input"));
        EnterEndDate.sendKeys("05022028");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickprofession = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[6]/div/input"));
        clickprofession.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enterprofession = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[6]/div/input"));
        enterprofession.sendKeys("Customer Support");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickpassword = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[9]/div/div[1]/input"));
        clickpassword.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement enterpassword = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[9]/div/div[1]/input"));
        enterpassword.sendKeys("Areej@123");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickcpassword = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[10]/div/div[1]/input"));
        clickcpassword.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement sendcpassword = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[10]/div/div[1]/input"));
        sendcpassword.sendKeys("Areej@123");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clicknext = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[3]/button"));
        clicknext.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickbusinesstype = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[2]/div/input"));
        clickbusinesstype.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterbusinesstype = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[2]/div/input"));
        enterbusinesstype.sendKeys("SME In a Box");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickcompanyaddress = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[3]/div/input"));
        clickcompanyaddress.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendcompanyaddress = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[3]/div/input"));
        sendcompanyaddress.sendKeys("Madagascar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        WebElement clickcity = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[4]/div/input"));
        clickcity.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement entercity = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[4]/div/input"));
        entercity.sendKeys("Madagascar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickpostalcode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[5]/div/input"));
        clickpostalcode.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterpostalcode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[5]/div/input"));
        enterpostalcode.sendKeys("44000");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickinstallationaddress = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[6]/div/input"));
        clickinstallationaddress.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendinstallationaddress = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[6]/div/input"));
        sendinstallationaddress.sendKeys("Madagascar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clicekcity = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[7]/div/input"));
        clicekcity.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterecity = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[7]/div/input"));
        enterecity.sendKeys("Madagascar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickepostalcode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[8]/div/input"));
        clickepostalcode.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterepostalcode = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[8]/div/input"));
        enterepostalcode.sendKeys("44000");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickNIF = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[11]/div/input"));
        clickNIF.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendNIF = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[1]/div[11]/div/input"));
        sendNIF.sendKeys("44000");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clicknextto = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/form/div/div[2]/button"));
        clicknextto.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickconnect = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/div/label[2]"));
        clickconnect.click();
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
        WebElement clicknext1 = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/p-dialog/div/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[2]/button[2]"));
        clicknext1.click();
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
