package day15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Prac extends TestBase {
    @Test
    public void test() {
         /*
        Bir Web sayfasında upload işlemi yapmamız gerekirse;
            1-Öncelikle upload edeceğimiz webelementi locate ederiz
            2-Upload edeceğimiz dosya yolunu bir string'e assingn ederiz
            3-Locate ettiğimiz webelement'e sendkeys() methodu ile dosyayolunu aldığımız string değişkeni göndeririz
         */
        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement upLoad=driver.findElement(By.id("file-upload"));
        bekle(3);
        String dosyaYolu="C:\\Users\\monster\\Desktop\\b129.txt.txt";
        String dosyaYolu1=System.getProperty("user.home") + "\\Desktop\\b129.txt.txt";
        System.out.println(dosyaYolu1);
        upLoad.sendKeys(dosyaYolu);
        driver.findElement(By.id("file-submit")).click();

        WebElement fileUpload=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(fileUpload.isDisplayed());

    }
}
