package day09_DropDown_Alerts;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Ornek01 extends TestBase {
    @Test
    public void test01() {
        // https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
        bekle(3);
        driver.switchTo().alert().accept();

    }

    @Test
    public void test02() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        bekle(3);
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void test03() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
        bekle(3);
        driver.switchTo().alert().sendKeys("Erel");
        driver.switchTo().alert().accept();

    }
}
