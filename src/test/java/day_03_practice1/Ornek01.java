package day_03_practice1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Ornek01 extends TestBase {
    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        // dropdown'dan "Books" secenegini secin
WebElement ddm=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
    }

    @Test
    public void test02() {
        // arama cubuguna "Java" aratın
        driver.get("https://www.amazon.com/");
      WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
      aramaKutusu.sendKeys("java",Keys.ENTER);

        // arama sonuclarinin Java icerdigini test edin
     String actual=aramaKutusu.getText();

        String expected="java";
        Assert.assertTrue(actual.contains(expected));
    }

}
