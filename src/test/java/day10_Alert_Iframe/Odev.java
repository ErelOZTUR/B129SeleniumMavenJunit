package day10_Alert_Iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Odev extends TestBase {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/iframe adresine
//gidin.
//● Bir metod olusturun: iframeTest
//○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        driver.get("https://the-internet.herokuapp.com/iframe");
     WebElement bir= driver.findElement(By.xpath("//*[@id='mce_0']"));
   //     Assert.assertTrue(bir.isEnabled());
    //    System.out.println(bir.getText());
//○Text Box’a “Merhaba Dunya!” yazin.
        driver.switchTo().frame(0);
    //   WebElement text= driver.findElement(By.id("mce_0_ifr"));
    //   text.sendKeys("Merhaba Dunya!");
//○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
        driver.switchTo().defaultContent();
       WebElement textlink=driver.findElement(By.xpath("(//*[@target='_blank'])[2]"));
       Assert.assertTrue(textlink.isDisplayed());
        System.out.println(textlink.getText());
//oldugunu dogrulayin ve konsolda yazdirin

    }
}
