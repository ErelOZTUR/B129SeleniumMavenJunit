package day09_DropDown_Alerts;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C02_TestBaseDemo extends TestBase {
    @Test
    public void test01() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Başlığın "Bootcamp" içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expected = "Bootcamp";
        Assert.assertTrue(actualTitle.contains(expected));

    }
}