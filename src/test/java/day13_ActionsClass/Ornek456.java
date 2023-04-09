package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ornek456 extends TestBase {
    @Test
    public void name() {
        driver.get("https://jqueryui.com/droppable");
        driver.switchTo().frame(0);
        WebElement dragSource= driver.findElement(By.id("draggable"));
        WebElement dropTarget=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragSource,dropTarget).perform();
    }

    @Test
    public void test02() {
        driver.get("https://jqueryui.com/droppable");
        driver.switchTo().frame(0);
        WebElement dragSource= driver.findElement(By.id("draggable"));
        WebElement dropTarget=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(dragSource).moveToElement(dropTarget).release().perform();

    }
}
