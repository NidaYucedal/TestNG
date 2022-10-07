package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {


    @Test
    public void test01() {

        String url= ConfigReader.getProperty("amznUrl");
        String urlface=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(url);
        Driver.getDriver().get(urlface);
        Driver.closeDriver();

    }
}
