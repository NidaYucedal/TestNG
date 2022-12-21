package tests.day23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HealthPage;
import utilities.Driver;

public class C03DataProvider {

    HealthPage page;

    @DataProvider
    public static Object[][] users(){
        return  new Object[][]{{"Nida","Batch81."},{"team13","Zaq1Zaq1.."}};
    }

    @Test(dataProvider = "users")
    public void test(String user,String pass){

        page=new HealthPage();

        Driver.getDriver().get("https://www.medunna.com");

        page.icon.click();
        page.signin.click();
        page.username.sendKeys(user);
        page.password.sendKeys(pass);
        page.signinButton.click();
    }
}
