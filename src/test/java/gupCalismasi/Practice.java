package gupCalismasi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Practice extends TestBase {
    //- ebay sayfasına gidiniz
    //- electronics bölümüne tıklayınız
    //- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
    //- Her sayfanın sayfa başlığını yazdıralım
    //- sayfayı kapatalım
    @Test
    public void test01() {
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();
         List<WebElement> pictures =driver.findElements(By.xpath("//*[@width='225' and @height='225']"));

      for (int i=0; i<pictures.size();i++){
          driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
          pictures.get(i).click();
          System.out.println(driver.getTitle());
          driver.navigate().back();
      }

    }
}
