package myWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_DropDown extends UtilitiesErel {
    @Test
    public void test01() {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       WebElement visible= driver.findElement(By.xpath("//*[text()='Dropdown Example']"));
        System.out.println(visible.isDisplayed());
    }
    //REUSABLE METHOD: Dropdown için tekrar tekrar kullanabileceğimiz bit method oluşturalım
  //  public void selectDropDown(WebElement dropdown,String secenek) {
        //3-Option3 ü seçin.
       // selectDropDown(driver.findElement(By.xpath("//*[@id='year']")),"2005");
      //  selectDropDown(driver.findElement(By.xpath("//*[@id='month']")),"May");
      //  selectDropDown(driver.findElement(By.xpath("//*[@id='day']")),"2");
     //  List<WebElement> degerler= dropdown.findElements(By.tagName("option"));
     //  degerler.stream().forEach(t-> System.out.println(t.getText()));

      //  List<WebElement> options=dropdown.findElements(By.tagName("option"));
     //   for (WebElement eachOption:options) {
      //      if (eachOption.getText().equals(secenek)){
     //           eachOption.click();
       //         break;
    //        }
    //    }
//    }
    @Test
    public void selectDropDown() {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        selectDropDown(driver.findElement(By.xpath("//*[@id='year']")),"2011");
        selectDropDown(driver.findElement(By.xpath("//*[@id='month']")),"May");
        selectDropDown(driver.findElement(By.xpath("//*[@id='day']")),"2");
    }

    @Test
    public void option3() {
         /*
1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
3-Option3 ü seçin.
4-Option3 ün seçili olduğunu doğrulayın.
*/
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    //    option3(driver.get("https://rahulshettyacademy.com/AutomationPractice/")),"option3";
    }
}
