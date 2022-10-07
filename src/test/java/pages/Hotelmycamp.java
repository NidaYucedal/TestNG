package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.checkerframework.framework.qual.DefaultFor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hotelmycamp {

    public Hotelmycamp() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    public WebElement login;


    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement log;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement manager;

    @FindBy(xpath = "//span[normalize-space()='Try again please']")
    public WebElement tryAgain;

    @FindBy(xpath = "//span[normalize-space()='Hotel Management']")
    public WebElement dropDown;

    @FindBy(xpath = "//span[normalize-space()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotel;

    @FindBy(xpath = "//a[normalize-space()='Hotel List']")
    public WebElement hotelList;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroup;


    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement save;

    @FindBy(xpath = "//a[normalize-space()='Hotel Rooms']")
    public WebElement hotelRoom;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelRoom;


    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[text()='Add Room Reservation '] ")
    public WebElement addRoomReservationButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement hotelWasInsertedSuccessfully;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement ok;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfHotelrooms;


    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement hotelresSave;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement roomReserMessage;

    @FindBy(xpath = "//div[@class='btn btn-primary']")
    public WebElement okey;

}
