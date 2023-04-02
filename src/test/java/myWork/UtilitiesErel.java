package myWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public abstract class UtilitiesErel {
    protected static WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
    public void selectDropDown(WebElement dropdown, String secenek){
        List<WebElement> options=dropdown.findElements(By.tagName("option"));
        for (WebElement eachOption:options) {
            if (eachOption.getText().equals(secenek)){
                eachOption.click();
                break;
            }
        }
    }
    //HARD WAIT
    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    //Alert ACCEPT
    public static void alertAccept(){
        driver.switchTo().alert().accept();
    }
    //Alert DISMISS
    public static void alertDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public static void alertText(){
        driver.switchTo().alert().getText();
    }
    public static void alertprompt(String text){
        driver.switchTo().alert().sendKeys(text);

    }
    //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
    public static void ddmVisibleText(WebElement ddm,String secenek){
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);

//    public void option3(WebElement opt,String deg){
//        List<WebElement> sec=opt.findElements(By.xpath("//*[@id='dropdown-class-example']"));
//        for (WebElement w:sec) {
//            if (w.getText().equals(deg)){
//                w.click();
//                break;
//            }
//
//        }
//    }
}
}
