package tests.day21;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import pages.HepsiPage;
import utilities.Driver;

public class Http {

    HepsiPage hepsiPage;

    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();


    @Test
    public void test01() {

        // TODO Auto-generated method stub

        String homePage = "https://www.hepsiburada.com";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        Driver.getDriver().get(homePage);

        hepsiPage=new HepsiPage();

        //cookie kabul et
        js.executeScript("arguments[0].click();", hepsiPage.cookie);

        List<WebElement> links = Driver.getDriver().findElements(By.xpath("(//div[@class='sf-ChildMenuItems-OMxRJDk0466HYQpTli0P'])[1]//ul//li//ul//li//a//span"));

        Iterator<WebElement> it = links.iterator();

        while (it.hasNext()) {

            url = it.next().getAttribute("href");

            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(homePage)) {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }
}