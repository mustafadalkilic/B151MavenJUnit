package day24_Priority_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class C01_Priority {
    /*
            Junitte test methodlarını istediğimiz şekilde sıralamak için method isimlerini alfabetik ve numerik sıralı
       olarak yazmamız gerekiyordu. TestNG frameworkunde bu sıralama için @Test notasyonundan sonra parametre olarak
       (priority = 1 ) gibi öncelik sırası belirterek test methodlarımızı sıralayabiliriz.
       Priority kullanmadığımız methodda priority değerini 0(sıfır) olarak kabul eder.
         */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

   // @Test(priority = 1)
    protected void amazonTest() {
        driver.get("https://amazon.com");
    }
  //  @Test(priority = 0)
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }
  //  @Test(priority = 2)
    public void facebookTest() {
        driver.get("https://facebook.com");
    }

    //Istedigimiz test methodunu tarayip ctrl + mouse sol tus surukle birak ile kopyalama islemi yapar



}
