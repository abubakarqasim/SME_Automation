package tests;


import base.SMETest;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;

public class CnfrmPack extends SMETest {


    //@Test (priority = 0)
    public void LoadingPageTestDown() throws InterruptedException {
        reports.logTestNameAndDescription("LandingPageScrollDown" , "SME Automation");
        loadingPage.ScrollDown();
        reports.logPassedTestSteps("Passed");
        reports.logPassedTestSteps("Failed");

    }
    //@Test (priority = 1)
    public void LoadingPageTestUp() throws InterruptedException {
        reports.logTestNameAndDescription("LandingPageScrollUp" , "SME Automation");
        loadingPage.ScrollUp();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }
    //@Test (priority = 2)
    public void ClientSupport() throws InterruptedException {
        reports.logTestNameAndDescription("Customer Support" , "SME Automation");
        customerSupport.ClientSupport();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }

    //@Test (priority = 2)
    public void SMEChat() throws InterruptedException {
        reports.logTestNameAndDescription("SMEChatBot" , "SME Automation");
        smeChatBot.SMEChat();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");
    }

    //@Test (priority = 3)



    //@Test (priority = 3)
    public void KeepinTouch() throws InterruptedException {
        reports.logTestNameAndDescription("KeepInTouch" , "SME Automation");
        keepInTouch.KeepinTouch();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");
    }
    //@Test (priority = 4)
    public void ScrollPage() throws InterruptedException {
        reports.logTestNameAndDescription("ScrollPage" , "SME Automation");
        scrollThePage.ScrollPage();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");
    }
    //@Test (priority = 5)
    public void ContactWithUs() throws InterruptedException {
        reports.logTestNameAndDescription("ContactUs" , "SME Automation");
        contactUs.ContactWithUs();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");
    }
    @Test (priority = 6)
    public void confirmPageTest() throws InterruptedException {
        reports.logTestNameAndDescription("ConfirmPackage" , "SME Automation");
        confirmPackage.ConfirmPack();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }
    @Test (priority = 7)
    public void LocationSeletion() throws InterruptedException {
        reports.logTestNameAndDescription("SelectLocation" , "SME Automation");
        selectLocation.LocationSeletion();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }
    @Test (priority = 8)
    public void CheckEligibility() throws InterruptedException {
        reports.logTestNameAndDescription("CheckEligility" , "SME Automation");
        checkEligibility.CheckEligibility();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }
    @Test (priority = 9)
    public void ConfigureSolution() throws InterruptedException {
        reports.logTestNameAndDescription("Configure Solution" , "SME Automation");
        configureYourSolution.ConfigureSolution();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }
    @Test (priority = 10)
    public void SolutionConfiguration() throws InterruptedException {
        reports.logTestNameAndDescription("Configure Solution" , "SME Automation");
        configureYourSolution.SolutionConfiguration();
        reports.logPassedTestSteps("Passed");
        reports.logFailTestSteps("Failed");

    }





}
