package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AtmPage {

    public AtmPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    public WebElement items;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public WebElement add;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewcart;

    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    public WebElement visible;
}
