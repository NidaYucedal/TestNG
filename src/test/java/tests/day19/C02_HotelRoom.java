package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_HotelRoom {

    //1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //2. Bir metod olusturun: RoomCreateTest()
    //3. https://www.hotelmycamp.com adresine gidin.
    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
    //a. Username : manager b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna basin.
    //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.
    //11. Hotel rooms linkine tıklayın.
    //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..


    @Test
    public void RoomCreateTest() {

        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmycamp.password.sendKeys(ConfigReader.getProperty("password"));

        hotelmycamp.login.click();
        hotelmycamp.hotelManagement.click();
        hotelmycamp.hotelRoom.click();
        hotelmycamp.addHotelRoom.click();


        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna basin.

        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelmycamp.hotelWasInsertedSuccessfully.isDisplayed());

        //10. OK butonuna tıklayın.
        hotelmycamp.ok.click();

        //11. Hotel rooms linkine tıklayın.
        hotelmycamp.hotelRoom.click();

        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
        Assert.assertTrue(hotelmycamp.listOfHotelrooms.isDisplayed());

    }
}
