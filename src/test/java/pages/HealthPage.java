package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HealthPage {

    public  HealthPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement icon;


    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement signin;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;


    @FindBy(xpath = "(//span[normalize-space()='Sign in'])[3]")
    public WebElement signinButton;



 // @FindBy(xpath = "")
 // public WebElement ;


 // @FindBy(xpath = "")
 // public WebElement ;


 // @FindBy(xpath = "")
 // public WebElement ;


 // @FindBy(xpath = "")
 // public WebElement ;
}
