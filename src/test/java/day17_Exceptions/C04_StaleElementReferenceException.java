package day17_Exceptions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C04_StaleElementReferenceException extends TestBase {

    /*
STALE_ELEMENT_REFERENCE_EXCEPTION
    Bir webelementin sayfayı refreh(yenileme) yada back-forward yapma sonucundan eskimesi(bayatlaması)
 durumunda bu exception'ı alırız. Yani driver sayfayı yeniden oluşturduğunda elementin locate'i aynı
 olmasına rağmen tekrar o elementin locatini almamızı ister. Almadığımız takdirde locate'i eskimis olarak görür ve
 staleelementrefenceexception hatası verir.
 */

     @Test
    public void test01() {

         //techproeducation sayfasına gidelim
         driver.get("https://techproeducation.com");
         bekle(2);
         driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
         //arama kutusunda qa aratalım
         WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='search']"));

         driver.navigate().refresh();
         /*
        org.openqa.selenium.StaleElementReferenceException hatası aldık çünkü refresh yaptıktan sonra
        tekrar locate almadık. Dolayısıyla bu hatayı handle edebilmek için refresh yaptıktan sonra
        tekrar locate almalıyız.
         */

         aramaKutusu.sendKeys("qa", Keys.ENTER);

         //sayfa başlığının qa içerdiğini test edelim
         Assert.assertTrue(driver.getTitle().contains("qa"));


    }

    @Test
    public void test02() {

        /*
        Bu test methodunda test01 methodundaki staleelementreference hatasini nasil handle ettigimizi
         gosterdik
         */

        //techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        bekle(2);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();

        //arama kutusunda qa aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='search']"));
        driver.navigate().refresh();

        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("qa", Keys.ENTER);//--> aramaKutusu eskidigi icin sendKeys() methodunu kullanamadi

        //sayfa basliginin qa icerdigini test edelim
        Assert.assertTrue(driver.getTitle().contains("qa"));


    }

    @Test
    public void test03() {

        //techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        bekle(2);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        //arama kutusunda qa aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='search']"));
        aramaKutusu.sendKeys("developer",Keys.ENTER);
        driver.navigate().back();
        driver.navigate().forward();
        /*
        org.openqa.selenium.StaleElementReferenceException : back- forward sonrasinda da bu hatayi aldik
         */
        aramaKutusu.sendKeys("qa", Keys.ENTER);
        //sayfa basliginin qa icerdigini test edelim
        Assert.assertTrue(driver.getTitle().contains("qa"));


    }

    @Test
    public void tes04() {
        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //arama kutusuna iphone aratalim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone",Keys.ENTER);
        //cikan sonuclardan ilk besine tiklayip her urunun basligini konsola yazdiralim
        List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='aok-relative']"));
        for (int i = 0; i < urunler.size() ; i++) {
            urunler.get(i).click();
            bekle(2);
            System.out.println(driver.getTitle());
            driver.navigate().back();
            bekle(2);
            if (i==4){
                break;
            }
            urunler = driver.findElements(By.xpath("//*[@class='aok-relative']"));//S.E.R.E hatasini handle ettik
        }

    }
}
