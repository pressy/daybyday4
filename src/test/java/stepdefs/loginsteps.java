package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class loginsteps {


    WebDriver driver;

    @Given("^I navigate to giftrete.com$")
    public void iNavigateToGiftreteCom() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Ahmed\\IdeaProjects\\daybyday4\\src\\test\\resources\\features\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

        String url = "https://www.giftrete.com/";
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("^I click on the login link$")
    public void iClickOnTheLoginLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        HomePage homePage =new HomePage (driver);

        homePage.ClickonloginLink();

    }

    @And("^I enter email$")
    public void iEnterEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail();

    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword();
    }

    @And("^I click on secure sign in$")
    public void iClickOnSecureSignIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnSecureSignIn();
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertFalse(loginPage.isErrorDisplayed());
    }

    @Then("^I close the window$")
    public void iCloseTheWindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    @And("^I enter invalid password$")
    public void iEnterInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterInvalidPassword();

    }

    @Then("^I should not be logged in$")
    public void iShouldNotBeLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isErrorDisplayed());
    }
}
