package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ornekl extends TestBase {
    //https://www.selenium.dev/downloads/ adresine gidelim
    //Sayfanın resmini alalım
    //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
    //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
    //Documentation webelementinin resmini alalım
    //All versions available in Downloads altında Latest stable release olan linki tıklayalım
    //Açılan pencerede chromedriver'i indirelim
    //Driver'in indiğini doğrulayalım

    @Test
    public void test() throws IOException {
        driver.get("https://www.selenium.dev/downloads/");

        String first = driver.getWindowHandle();

        Actions actions = new Actions(driver);
        WebElement platform =driver.findElement(By.xpath("//*[text()='Platforms Supported by Selenium']"));
        actions.scrollToElement(platform).perform();
        // tumSayfaResmi();

        driver.findElement(By.xpath("(//button[@class='btn btn-dark btn-lg btn-block rounded-0 text-left'])[1]")).click();
        bekle(3);

        driver.findElement(By.xpath("(//*[text()='documentation'])[5]")).click();

        WebElement chrome=driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']"));
        webElementResmi(chrome);

        chrome.click
                ();

        Set<String> handles= driver.getWindowHandles();
        List<String> list= new ArrayList<>(handles);

        String birinci = list.get(0);
        String ikinci = list.get(1);

        if (first.equals(birinci)){
            driver.switchTo().window(ikinci);
        }else {
            driver.switchTo().window(birinci);
        }

        driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();

        String userHome=System.getProperty("user.home");
        System.out.println("userHome = " + userHome);
        boolean existFile= Files.exists(Paths.get(userHome+"\\Downloads\\chromedriver_win32 (2).zip.crdownload"));
        Assert.assertTrue(existFile);

        Files.deleteIfExists(Paths.get(userHome+"\\Downloads\\chromedriver_win32 (2).zip\""));
        boolean existFile02=Files.exists(Paths.get(userHome+"\\Downloads\\chromedriver_win32 (2).zip\""));
        Assert.assertFalse(existFile02);
    }
}
