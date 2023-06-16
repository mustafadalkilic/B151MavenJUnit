package day13_Cookies_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions extends TestBase {

    @Test
    public void test01() {

        // https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //Kutuya sag tıklayın
        WebElement kutu = driver.findElement(By.id("hot-spot"));
        //Sag klik yapabilmek icin oncelikle Action class' indan bir obje olusturmaliyiz
        Actions actions = new Actions(driver);
        actions.contextClick(kutu).//sag klik yapma methodu kullandik
                perform();//action objemizle yapacagimiz islemi uygulamasi icin veya sonlandirmasi icin perform() kullaniriz

        // Alert'te cikan yazinin"You selected a context menu"oldugunu test edin

        Assert.assertEquals("You selected a context menu",getTextAlert());
        //TestBase' deki getTextAlert() methodu kullandik --> driver.switchTo().alert().getText();

        //Tamam diyerek alert’i kapatın
        acceptAlert();//-->TestBase deki methodu kullandık --> driver.switchTo().alert().accept()







    }
}
