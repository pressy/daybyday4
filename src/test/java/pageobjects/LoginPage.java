package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using  = "email")
    private WebElement emailTextBox;


    @FindBy(how = How.ID, using  = "password")
    private WebElement passwordTextBox;

    @FindBy(how = How.CSS, using  = "button.huge:nth-child(2)")
    private WebElement secureSignInBox;

    @FindBy(how = How.CLASS_NAME, using  = "alert alert-danger")
    private WebElement loginErrorMessage;



    public void enterEmail()
    {
        emailTextBox.sendKeys("tolanikelani@gmail.com");

    }
    public void enterPassword()
    {
        passwordTextBox.sendKeys("0000000a");

    }

    public void enterInvalidPassword() {
        passwordTextBox.sendKeys("1223345d");

        {

        }

    }

    public void clickOnSecureSignIn()
    {
        secureSignInBox.click();


    }

    public boolean isErrorDisplayed()
    {
        return loginErrorMessage.isDisplayed();
    }
}

