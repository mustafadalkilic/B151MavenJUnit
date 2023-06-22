package day17_Exceptions;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {

    @Test
    public void test01() {
        /*
         NO_SUCH_ELEMENT_EXCEPTION
            -Bir webelementin locate'ini yanlis aldigimizda, elementi bulamayacagi icin bu
            exception'i aliriz



         */

        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //arama kutusunda qa aratalım

        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='sAearch']"));
        aramaKutusu.sendKeys("qa", Keys.ENTER);

        /*normal locatemiz //*[@type='search'] bu sekilde iken NoSuchElementException alabilmek icin locate'i bozduk
        //*[@type='ssearch'] ve exception'i aldigimizi gorduk. Dolayisiyla bu hatayi handle edebilmek icin
        duzgun locate almamiz gerekiyor
         */




        //sayfa başlığının qa içerdiğini test edelim

        Assert.assertTrue(driver.getTitle().contains("qa"));
    }

    @Test
    public void TEST02() {

        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //arama kutusunda qa aratalım

        WebElement aramaKutusu = driver.findElement(By.cssSelector("//*[@type='sAearch']"));
        aramaKutusu.sendKeys("qa", Keys.ENTER);

      /*
        org.openqa.selenium.InvalidSelectorException: xpath ile aldigimiz bir webelementin locate'ini
        cssSelector locator ile kullanirsak bu exception'i aliriz. Dolayısıylla bunu handle etmek için
         dogru locator kullanmamız gerekir
         */




        //sayfa başlığının qa içerdiğini test edelim

        Assert.assertTrue(driver.getTitle().contains("qa"));











    }
}

