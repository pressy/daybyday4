package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(how = How.LINK_TEXT, using  = "Login")
    private WebElement loginLink;

    public void ClickonloginLink()
    {
        loginLink.click();
    }
}
