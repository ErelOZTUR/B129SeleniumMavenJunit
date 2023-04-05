package day09_DropDown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class Ornek extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        //a. Tüm eyalet isimlerini yazdıralım
        WebElement state=driver.findElement(By.id("state"));
        // selectDropDown(driver.findElement(By.xpath("//*[@id='year']")),"2005");
        //  selectDropDown(driver.findElement(By.xpath("//*[@id='month']")),"May");
        //  selectDropDown(driver.findElement(By.xpath("//*[@id='day']")),"2");
          Select select=new Select(state);
         // select.selectByIndex(4);
         // select.selectByVisibleText("Utah");
        //  select.selectByValue("AZ");
        // List<WebElement> tümstate= select.getOptions();
        //  tümstate.forEach(t-> System.out.println(t.getText()));
     //   System.out.println("************************************************");
      //  List<WebElement> eyaletler=driver.findElements(By.tagName("option"));
      //  eyaletler.forEach(t-> System.out.println(t.getText()));
       // ddmIndex(state,10);
      //  ddmValue(state,"AL");
       // ddmVisibleText(state,"Utah");
    }
}
