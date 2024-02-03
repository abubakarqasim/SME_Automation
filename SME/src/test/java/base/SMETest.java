package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import utilities.Reports.Report;

public class SMETest {

    WebDriver driver;

    protected ConfirmPackage confirmPackage;
    protected Report reports;

    protected LoadingPage loadingPage;
    protected CustomerSupport customerSupport;

    protected SMEChatBot smeChatBot;
    protected KeepInTouch keepInTouch;

    protected ScrollThePage scrollThePage;
    protected ContactUs contactUs;
    protected SelectLocation selectLocation;

    protected CheckEligibility checkEligibility;

    protected ProductsServices productsServices;
    protected ProductsServicesScroll productsServicesScroll;
    protected ConfigureYourSolution configureYourSolution;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        confirmPackage = new ConfirmPackage(driver);
        reports = new Report(driver);
        loadingPage = new LoadingPage(driver);
        customerSupport = new CustomerSupport(driver);
        smeChatBot = new SMEChatBot(driver);
        keepInTouch = new KeepInTouch(driver);
        scrollThePage = new ScrollThePage(driver);
        contactUs = new ContactUs(driver);
        selectLocation = new SelectLocation(driver);
        checkEligibility = new CheckEligibility(driver);
        productsServices = new ProductsServices(driver);
        productsServicesScroll = new ProductsServicesScroll(driver);
        configureYourSolution = new ConfigureYourSolution(driver);
        driver.manage().window().fullscreen();
        driver.get("https://sme-web-portal-qa.mvola.mg/#/sales");
//        driver.manage().window().fullscreen();
        reports.extentReporter();

    }

    @AfterClass
    public void tearDown() {
        reports.flushExtentReport();
        driver.quit();
    }
}
