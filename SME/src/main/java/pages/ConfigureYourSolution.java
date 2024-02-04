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

//    public void ConfigureSolution() throws InterruptedException {
//        Thread.sleep(3000);
//
//        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        Thread.sleep(3000);
//    }

    public void SolutionConfiguration() throws InterruptedException {
        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(5000);
        WebElement ValidateBox = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-preview-your-package/div/div/div[2]/div/div[3]/div/div[3]/div[4]/div[2]/button"));
        ValidateBox.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
        Thread.sleep(2500);
        scroller.executeScript("window.scrollTo(0, 400);");
        Thread.sleep(2500);
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
        Thread.sleep(1000);
        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
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
        Thread.sleep(5000);
        scroller.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(2000);
        scroller.executeScript("window.scrollTo(0, 600);");
        Thread.sleep(5000);
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickonname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[1]/input"));
        clickonname.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterthename = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[1]/input"));
        enterthename.sendKeys("Abubakar");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickonlname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[2]/input"));
        clickonlname.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterthelname = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[2]/input"));
        enterthelname.sendKeys("Abubakar");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickontel = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[3]/input"));
        clickontel.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterthetel = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[3]/input"));
        enterthetel.sendKeys("0387820827");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickonemail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[4]/input"));
        clickonemail.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement entertheemail = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[3]/div/div[4]/input"));
        entertheemail.sendKeys("abubakar908@gmail.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickonnext = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-payment-method/div/div/div[2]/div/div[3]/div/div[1]/div/div/p-tabview/div/div[2]/p-tabview/div/div[2]/p-tabpanel[1]/div/div[2]/button"));
        clickonnext.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
    }

    public void ContractPreview() throws InterruptedException {
        Thread.sleep(3000);

        scroller.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
    }

    public void DownloadContact()
    {
        WebElement clickontonext = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[2]/div/div[3]/button"));
        clickontonext.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickoncnfrm = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-user/div/div/div[2]/div/div[3]/div/div[3]/app-payment-receipt/div[4]/div[2]/button"));
        clickoncnfrm.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement selfcare = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-congratulations/div/div/div/div/div[3]/div/div/div[2]/div/button"));
        selfcare.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
    }



}
