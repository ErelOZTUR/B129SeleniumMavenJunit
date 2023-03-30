package day08_Assertion_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertion {
       /*
1)https://amazon.com adresine gidin
2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleriyapin
    ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
    ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
    ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
*/
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01() {
       // ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
       String actual= driver.getTitle();
       String expected="Amazon";
        Assert.assertTrue(actual.contains("Amazon"));


   // ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
    }

    @Test
    public void test02() {
        // ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
       WebElement picture= driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
       Assert.assertTrue(picture.isDisplayed());
    }

    @Test
    public void test03() {
        //○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
        WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        Assert.assertTrue(aramaKutusu.isEnabled());
    }

    @Test
    public void test04() {
        // ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
        String baslık=driver.getTitle();
        Assert.assertFalse("Gerçek baslık Amazon",baslık.contains("amazon"));


    }
}
