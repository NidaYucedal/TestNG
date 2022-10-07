package tests.day19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_CreateHotel {

    //1. Tests packagenin altına class olusturun: CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. https://www.hotelmycamp.com adresine git.
    //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    //a. Username : manager
    //b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna tıklayın.
    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın


    @Test
    public void createHotel() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.login.click();
        hotelmycamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmycamp.password.sendKeys(ConfigReader.getProperty("password"));
        hotelmycamp.log.click();


        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
       // Select select=new Select(hotelmycamp.dropDown);
       // select.selectByVisibleText("Hotel List");
        hotelmycamp.hotelManagement.click();
        hotelmycamp.hotelList.click();
        hotelmycamp.addHotel.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        hotelmycamp.code.sendKeys("31000");
        hotelmycamp.name.sendKeys("hannah moon");
        hotelmycamp.address.sendKeys("canada street 34");
        hotelmycamp.phone.sendKeys("15256143 265");
        hotelmycamp.email.sendKeys("moon@yahoo.com");

        Select select=new Select(hotelmycamp.idGroup);
        select.selectByVisibleText("Hotel Type2");

        //8. Save butonuna tıklayın.
        hotelmycamp.save.click();

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın

    }
}
