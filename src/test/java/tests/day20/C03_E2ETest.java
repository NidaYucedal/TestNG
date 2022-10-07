package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {

    Actions actions=new Actions(Driver.getDriver());

    //End to End Test(E2E): Bir uygulamanin tum adimlarini bastan sona kadar test etmek demektir.
    //Ornegin biz yonetici bir oda olusturabilir mi diye test yaptigimizda sisteme giristen oda olusturuldu
    //yazisi gorulunceye kadar tum adimlari test etmis oluruz, dolayisiyla E2E testi yapmis oluruz. Bu
    //testin diger adi da Sistem Testi’dir.

    @Test
    public void E2ETest() {

        //Tests packagenin altına class olusturun: CreateHotel
        //Bir metod olusturun: createHotel
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.login.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        hotelmycamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmycamp.password.sendKeys(ConfigReader.getProperty("password"));
        hotelmycamp.log.click();


        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelmycamp.hotelManagement.click();
        hotelmycamp.roomReservation.click();
        hotelmycamp.addRoomReservationButton.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //Save butonuna tıklayın.
        Faker faker=new Faker();
        hotelmycamp.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        //OK butonuna tıklayın.


        hotelmycamp.hotelresSave.click();
        Assert.assertTrue(hotelmycamp.roomReserMessage.isDisplayed());
        hotelmycamp.okey.click();


    }
}
