package day14_Actions_Faker;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class odev extends TestBase {

    /*
    1- "http://webdriveruniversity.com/Actions" sayfasina gidin
    2- Hover over  Me First" kutusunun ustune gelin
    3- Link 1" e tiklayin
    4- Popup mesajini yazdirin
    5- Popup'i tamam diyerek kapatin
    6- “Click and hold" kutusuna basili tutun
    7-“Click and hold" kutusunda cikan yaziyi yazdirin  8- “Double click me" butonunu cift tiklayin. Tıklandığını test edin
     */

    @Test
    public void test01() {

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        // 2- Hover over  Me First" kutusunun ustune gelin
        WebElement accountList= driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();

        // 3- Link 1" e tiklayin

        bekle(2);
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();

        //  4- Popup mesajini yazdirin

        String alerttext=driver.switchTo().alert().getText();
        System.out.println("alerttext = " + alerttext);


        // 5- Popup'i tamam diyerek kapatin
        acceptAlert();

        // 6- “Click and hold" kutusuna basili tutun
       WebElement element= driver.findElement(By.xpath("(//*[@class='col-lg-12 text-center'])[3]"));
       actions.clickAndHold(element).perform();


        // 7-“Click and hold" kutusunda cikan yaziyi yazdirin

        element=driver.findElement(By.id("click-box"));
        String yazi = element.getText();
        System.out.println(yazi);

        // 8- “Double click me" butonunu cift tiklayin. Tıklandığını test edin

        WebElement doubleclick = driver.findElement(By.xpath("//div[@id='double-click']"));
        actions.doubleClick(doubleclick).perform();


        String actualClass=doubleclick.getAttribute("class");
        String expectedClass="div-double-click double";
        Assert.assertEquals(actualClass , expectedClass);



    }
}
