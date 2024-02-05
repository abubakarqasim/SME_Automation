package tests;


import base.SMETest;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;

public class CnfrmPack extends SMETest {


    @Test (priority = 0)
    public void LoadingPageTestDown() throws InterruptedException {
        reports.logTestNameAndDescription("Landing Page SME" , "SME Automation");
        loadingPage.LandingPage();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 1)
    public void ProductandServices() throws InterruptedException {
        reports.logTestNameAndDescription("Product's & Services" , "SME Automation");
        productsServices.ProductandServices();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 2)
    public void FAQsSection() throws InterruptedException {
        reports.logTestNameAndDescription("FAQ Section" , "SME Automation");
        faQs.FAQsSection();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 3)
    public void ClientSupport() throws InterruptedException {
        reports.logTestNameAndDescription("Customer Support" , "SME Automation");
        customerSupport.ClientSupport();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 4)
    public void ContactWithUs() throws InterruptedException {
        reports.logTestNameAndDescription("Contact Us" , "SME Automation");
        contactUs.ContactWithUs();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 5)
    public void confirmPageTest() throws InterruptedException {
        reports.logTestNameAndDescription("Package Configuration" , "SME Automation");
        confirmPackage.ConfirmPack();
        reports.logPassedTestSteps("Passed");

    }

    @Test (priority = 6)
    public void CheckEligibility() throws InterruptedException {
        reports.logTestNameAndDescription("Check Service Eligibility" , "SME Automation");
        checkEligibility.CheckEligibility();
        reports.logPassedTestSteps("Passed");


    }

    @Test (priority = 7)
    public void SolutionConfiguration() throws InterruptedException {
        reports.logTestNameAndDescription("Register Yourself" , "SME Automation");
        configureYourSolution.SolutionConfiguration();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 8)
    public void ContractPreview() throws InterruptedException {
        reports.logTestNameAndDescription("Contract Preview & Download" , "SME Automation");
        configureYourSolution.ContractPreview();
        reports.logPassedTestSteps("Passed");
    }

    @Test (priority = 9)
    public void DownloadContact() throws InterruptedException {
        reports.logTestNameAndDescription("Package Configuration Confirmation" , "SME Automation");
        configureYourSolution.DownloadContact();
        reports.logPassedTestSteps("Passed");
    }








}