package day18_ScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;

public class C03_TumSayfaResmi extends TestBase {

    @Test
    public void Test01() {

        //Techproeducation sayfasına gidelim
        driver.get("https://www.Techproeducation.com");

        bekle(2);

        //Çıkan reklamı kapatalım
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //Ve ekran görüntüsünü alalım
        tumSayfaResmi();


    }
}
