package day14_FakerClass_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ornek extends TestBase {
    @Test
    public void test01() {
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
        WebElement search=driver.findElement(By.xpath("//*[@class='elementor-search-form__input']"));
        Actions actions=new Actions(driver);
        actions.keyDown(search, Keys.SHIFT).
                sendKeys("techpro").keyUp(Keys.SHIFT).
                sendKeys(" educations",Keys.ENTER).
                perform();
        driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
       WebElement rich= driver.findElement(By.xpath("(//h3//a)[9]"));
       actions.scrollToElement(rich).perform();
    }

    @Test
    public void test02() {
        Faker faker=new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().username());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.country().name());
        System.out.println(faker.name().title());
        System.out.println(faker.job().position());
        System.out.println(faker.number().digits(15));
    }
}
