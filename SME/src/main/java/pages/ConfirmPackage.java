package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPackage {

    WebDriver driver;

    public ConfirmPackage(WebDriver driver) {
        this.driver = driver;
    }

    public void ConfirmPack() throws InterruptedException {
        System.out.println("Hi Welcome in a SME");
        Thread.sleep(3000);

        WebElement cnfrmpack = driver.findElement(
                By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/div/div[2]/div[2]/div/a[2]"));
        cnfrmpack.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
//        
        WebElement idiscover = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div/label[1]/div[1]"));
        idiscover.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
//     

        WebElement manufacturing = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[1]/div[1]/label[1]/p"));
        manufacturing.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement suivant = driver
                .findElement(By.cssSelector("#content_0_0 > div.text-center.mt-5.ng-star-inserted > button"));
        suivant.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement suivant1 = driver
                .findElement(By.cssSelector("#content_0_1 > div.text-center.mt-5.ng-star-inserted > button"));
        suivant1.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }
//        suivant1.click();

        WebElement fixedlinecon = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[3]/div/label[1]/div[1]"));
        fixedlinecon.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement user = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[4]/div/label[1]/div[1]"));
        user.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement emailing = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[5]/div[1]/label[1]/div[1]"));
        emailing.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement suivant2 = driver
                .findElement(By.cssSelector("#content_0_4 > div.text-center.mt-5.ng-star-inserted > button"));
        suivant2.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement yesorno = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[6]/div/label[1]/div[1]"));
        yesorno.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement mobilefeet = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[7]/div/label[1]/div[1]"));
        mobilefeet.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement mailaddress = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[8]/div[1]/label[2]/div[1]"));
        mailaddress.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement suivant3 = driver
                .findElement(By.cssSelector("#content_1_0 > div.text-center.mt-5.ng-star-inserted > button"));
        suivant3.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement community = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[9]/div[1]/label[2]/div[1]"));
        community.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement suivant4 = driver
                .findElement(By.cssSelector("#content_2_0 > div.text-center.mt-5.ng-star-inserted > button"));
        suivant4.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickfirstname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[1]/div/input"));
        clickfirstname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterfirstname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[1]/div/input"));
        enterfirstname.sendKeys("Abubakar");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clicklastname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[2]/div/input"));
        clicklastname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement enterlastname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[2]/div/input"));
        enterlastname.sendKeys("Qasim");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickbusinessname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[3]/div/input"));
        clickbusinessname.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendbusinessname = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[3]/div/input"));
        sendbusinessname.sendKeys("abc");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickemail = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[4]/div/input"));
        clickemail.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendemail = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[4]/div/input"));
        sendemail.sendKeys("abakar001@gmail.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clicknumber = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[5]/div/input"));
        clicknumber.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendnumber = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[5]/div/input"));
        sendnumber.sendKeys("0344889918");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clickaddress = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[6]/div/input"));
        clickaddress.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement sendaddress = driver.findElement(By.xpath(
                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[10]/div[1]/div/form/div/div[6]/div/input"));
        sendaddress.sendKeys("Islamabad XYZ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

        WebElement clicknextform = driver.findElement(By.cssSelector("#content_3_0 > div.text-center.mt-5 > button"));
        clicknextform.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.getStackTrace();
        }

//        WebElement clicklocation = driver.findElement(By.xpath(
//                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[11]/app-locations-map/div[1]/div[1]/div/div/input"));
//        clicklocation.click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.getStackTrace();
//        }

//        WebElement sendlocation = driver.findElement(By.xpath(
//                "/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[11]/app-locations-map/div[1]/div[1]/div/div/input"));
//        sendlocation.sendKeys("3FCX+3CF, Antananarivo, Madagascar7");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.getStackTrace();
//        }

//        WebElement clciknextlocation = driver.findElement(By.xpath("/html/body/app-root/app-landing-layout/div/div[2]/div[1]/app-configure-your-package/div/div/div[2]/div/div[3]/div/div[2]/div[11]/div[2]/button"));
//        clciknextlocation.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.getStackTrace();
//            //Hi
//        }



    }
}



// Landing Page Scroll
// Product & Services
// FAQs
// Contact US
// Open Chat Bot
// Configure Y
