package day18_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C04_WEresmi extends TestBase {

    @Test
    public void test01() throws IOException {
       /*
    Bir webelementinin resmini almak icin once Webelementi locate edip bir WebElement'e assign ederiz.
    Ve bu webelement'i
    direk getScreenShotAs() methodunu kullaranak resmini belirttigimiz dosyaya kaydederiz
    */

    //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        bekle(2);

    //iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipone", Keys.ENTER);

    //çıkan sonuc yazısının resmını alalım

        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));

        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "src/test/java/ElementResmi/WEscreenShot" + tarih + ".jpeg";
        FileUtils.copyFile(sonucYazisi.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));




    }
}
