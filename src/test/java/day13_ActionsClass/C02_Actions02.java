package day13_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions02 extends TestBase {
    /*
    Amazon anasayfasına gidin
    "Account & List" üzerinde bekleyin (mouse over - hover over)
    Açılan menüde "Account" linkine tıklayın
    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
     */

    @Test
    public void actions() {
        ///*
        //    Amazon anasayfasına gidin
        driver.get("https://www.amazon.com");
        //    "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accountList= driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();
        //    Açılan menüde "Account" linkine tıklayın
        driver.findElement(By.xpath("//*[text()='Account']")).click();

        //    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
Assert.assertEquals("Your Account",driver.getTitle());
        //     */
    }

}
