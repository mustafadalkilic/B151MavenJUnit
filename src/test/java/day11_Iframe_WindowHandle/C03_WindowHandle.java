package day11_Iframe_WindowHandle;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_WindowHandle extends TestBase {
    @Test
    public void windowHandle() {
        /*
        Eğer sayfaya gittikten sonra yeni sekme yada yeni bir pencereyle başka sayfaya gittikten sonra
        tekrar ilk açtığınız sayfaya dönmek isterseniz, ilk sayfaya driver.get() methoduyla gittikten sonra
        String bir değişkene handle değerini assingn ederseniz tekrar ilk açılan sayfaya dönmek istediğinizde
        driver.switchTo().window(ilksayfaHandleDeğeri) ile geçiş yapabilirsiniz.
         */
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String tecproedWindowHandle = driver.getWindowHandle();

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().//Geçiş yap
                newWindow(WindowType.WINDOW);//-->Yeni bir pencereye driver'i taşır

        //WindowType.TAB --> Yeni bir sekme açar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(tecproedWindowHandle);
        bekle(3);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandle);
        bekle(3);


        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandle);
        bekle(3);

        /*
        WindowType.WINDOW ile de WindowType.TAB ile de driver' i her halukarda tasimiz oluruz.Birinde yeni pencerede acilirken digerinde yeni sekmede acilir
         */


    }

    @Test
    public void test02() {

         /*
        Eğer sayfaya gittikten sonra yeni sekme yada yeni bir pencereyle başka sayfaya gittikten sonra
        tekrar ilk açtığınız sayfaya dönmek isterseniz, ilk sayfaya driver.get() methoduyla gittikten sonra
        String bir değişkene handle değerini assingn ederseniz tekrar ilk açılan sayfaya dönmek istediğinizde
        driver.switchTo().window(ilksayfaHandleDeğeri) ile geçiş yapabilirsiniz.
         */
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String tecproedWindowHandle = driver.getWindowHandle();

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().//Geçiş yap
                newWindow(WindowType.TAB);//-->Yeni bir pencereye driver'i taşır

        //WindowType.TAB --> Yeni bir sekme açar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(tecproedWindowHandle);
        bekle(3);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandle);
        bekle(3);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandle);
        bekle(3);

        //TAB AYNI SAYFADA SEKME ACAR
        //NEW WINDOW YENI SAYFA ACAR

        /*
        Yeni bir class olusturun: WindowHandle
        Amazon anasayfa adresine gidin.
        Sayfa’nin window handle degerini String bir degiskene atayin
        Sayfa title’nin “Amazon” icerdigini test edin
        Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        Sayfa title’nin “Walmart” icerdigini test edin
        Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

         */

    }
}
