package tests.Calisma;


import org.testng.annotations.Test;
import pages.AtmPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C04_Rapor extends TestBaseRapor {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Scroll to bottom of page
    //4. Verify 'RECOMMENDED ITEMS' are visible
    //5. Click on 'Add To Cart' on Recommended product
    //6. Click on 'View Cart' button
    //7. Verify that product is displayed in cart page

    AtmPage atmPage;

    @Test
    public void test01() {

        atmPage=new AtmPage();

        extentTest=extentReports.createTest("Pozitif Test","Sayfanın en altına scroll yapıp ürünü sepete ekleyebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        extentTest.info("Automation sayfasına gidildi");

        //3. Scroll to bottom of page
        ReusableMethods.getActions().scrollToElement(atmPage.items).perform();
        extentTest.info("Sayfa sonuna scroll yapıldı");

        //4. Verify 'RECOMMENDED ITEMS' are visible
        ReusableMethods.getSoftAssert().assertTrue(atmPage.items.isDisplayed());
        extentTest.info("Urünun görüldügü dogrulandı");

        //5. Click on 'Add To Cart' on Recommended product
        atmPage.add.click();
        extentTest.info("Urun sepete eklendi");

        //6. Click on 'View Cart' button
        atmPage.viewcart.click();
        extentTest.info("Sepeti goruntule butonuna tıklandı");

        //7. Verify that product is displayed in cart page
        ReusableMethods.getSoftAssert().assertTrue(atmPage.visible.isDisplayed());
        ReusableMethods.getSoftAssert().assertAll();
        extentTest.pass("TEST basarılı bir sekilde calıstı");

    }
}