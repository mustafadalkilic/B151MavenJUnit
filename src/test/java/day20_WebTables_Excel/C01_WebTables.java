package day20_WebTables_Excel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01_WebTables extends TestBase {

    // thead--> tablonun baslıgı          // tbody-->tablonun ici(body)
    // tr--> satır                        // tr --> satır
    // th--> sütun                        // td --> sütun







    @Test
    public void webTablesTest1() {

        //  https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");


        // Table1'i yazdirin
        WebElement table1 = driver.findElement(By.xpath("//table[1]"));
        System.out.println(table1.getText());


        System.out.printf("%-10s %-10s %-25s %-10s %-30s %s%n", "Last Name", "First Name", "Email", "Due", "Web Site", "Action");
        System.out.printf("---------- ---------- ------------------------- ---------- ------------------------------ -------%n");
        System.out.printf("%-10s %-10s %-25s $%-9.2f %-30s %s%n", "Smith", "John", "jsmith@gmail.com", 50.0, "http://www.jsmith.com", "edit delete");
        System.out.printf("%-10s %-10s %-25s $%-9.2f %-30s %s%n", "Bach", "Frank", "fbach@yahoo.com", 51.0, "http://www.frank.com", "edit delete");
        System.out.printf("%-10s %-10s %-25s $%-9.2f %-30s %s%n", "Doe", "Jason", "jdoe@hotmail.com", 100.0, "http://www.jdoe.com", "edit delete");
        System.out.printf("%-10s %-10s %-25s $%-9.2f %-30s %s%n", "Conway", "Tim", "tconway@earthlink.net", 50.0, "http://www.timconway.com", "edit delete");

    }

    @Test
    public void test02() {

        //  https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");
        /*
         WebElement ucuncuSatir = driver.findElement(By.xpath("(//table)[1]//tr[3]")); ---baska yoll
        System.out.println("*********************************************");
        System.out.println(ucuncuSatir.getText());
         */


        // 3.satır verilerini yazdırın
        List<WebElement> list = driver.findElements(By.xpath("//table[1]//tbody//tr[3]//td"));

        list.stream().forEach(t-> System.out.print(t.getText() + " - "));



    }

    @Test
    public void test03() {

        //  https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");

        // son satırın verilerini yazdırın
        // List<WebElement> sonSatirVerileri = driver.findElements(By.xpath("//table[1]//tbody//tr[4]//td"));

        List<WebElement>sonSatırVerileri= driver.findElements(By.xpath("(//table)[1]//tbody//tr[4]//td"));
        sonSatırVerileri.stream().forEach(t-> System.out.print(t.getText() + " - "));


    }

    @Test
    public void test04() {
        //  https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");


        // 5. Sütun baslıgını yazdırın
        WebElement besinciSutunBasligi = driver.findElement(By.xpath("//table[1]//thead//tr[1]//th[5]"));
        System.out.println(besinciSutunBasligi.getText());



        // 5.Sütun verilerini yazdırın
        List<WebElement> besinciSutunVerileri = driver.findElements(By.xpath("//table[1]//tbody//tr//td[5]"));

        besinciSutunVerileri.stream().forEach(t-> System.out.println(t.getText() + " - "));


    }

    @Test
    public void test05() {

        //  https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");


        // iki parametreli bir java methodu olusturalım
        // Parametre 1 => satır numarasını
        // Parametre 2 => sutun numarası

        // prinData(2,3) ==> 2. satır, 3. sutundaki veriyi yazdırın

        printData(2,3);
        printData(2,5);
        printData(3,2);
        // printData(1,7); 7. sutun olmadıgı icin NoSuchElementException hatası alırız
    }

    public void printData(int satir, int sütün) {

     WebElement satirSütun =  driver.findElement(By.xpath("//table[1]//tbody//tr["+satir+"]//td["+sütün+"]"));

        System.out.println(satirSütun.getText());



    }
}


