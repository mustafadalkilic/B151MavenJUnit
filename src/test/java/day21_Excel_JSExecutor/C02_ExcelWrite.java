package day21_Excel_JSExecutor;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_ExcelWrite {

    /*
        Bir "NÜFUS" sütunu oluşturup başkent nüfuslarını excel doyasına yazınız:
        (D.C: 712816, Paris: 2161000, London: 8982000, Ankara: 5663000 ...)
 */

    /*
        -->Bir hucreye veri ekleyebilmek icin belirtmis oldugumuz satirdan sonra hangi hucreye(cell) ekleme yapacaksak
        createCell(cell numarasi) methodu ile cell icine eklenecek veri icin setCellValue() methodu kullanarak istedigimiz
        veriyi ekleyebiliriz
    */



    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resourses/Capitals (2).xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        workbook.getSheet("Sheet1").getRow(0).createCell(2).setCellValue("NUFUS");
        workbook.getSheet("Sheet1").getRow(1).createCell(2).setCellValue("712816");
        workbook.getSheet("Sheet1").getRow(2).createCell(2).setCellValue("2161000");
        workbook.getSheet("Sheet1").getRow(3).createCell(2).setCellValue("8982000");
        workbook.getSheet("Sheet1").getRow(4).createCell(2).setCellValue("5663000");

          /*
            Excel'e veri ekleme isleminden sonra FileOutputStream ile ekledigimiz verileri workbook objesi ile
        create() thodu kullanarak kaydederiz.
            Bu sekilde excel'e veriler kaydedilmis olur. Sonra yapacagimiz farkli islemlerde hata almamamiz icin
        fos(FileOutputStream).close() ve workbook.close() methodlariyla yaptigimiz islemleri sonlandirmis oluruz
         */

        FileOutputStream fos =new FileOutputStream("src/test/java/resourses/Capitals (2).xlsx");
        workbook.write(fos);
        fos.close();
        workbook.close();

        /*
    ODEV1
    1.satirdaki 2.hucreye gidelim ve yazdiralim
    1.satirdaki 2.hucreyi bir string degiskene atayalim ve  yazdiralim
    2.satir 4.cell'in afganistan'in baskenti oldugunu test  edelim
    Satir sayisini bulalim
    Fiziki olarak kullanilan satir sayisini bulun
    Ingilizce Ulke isimleri ve baskentleri bir map olarak  kaydedelim
 */
    /*
    ODEV2
    Yeni bir test method olusturalim writeExcelTest()
    Adimlari takip ederek 1.satira kadar gidelim
    5.hucreye yeni bir cell olusturalim
    Olusturdugumuz hucreye "Nufus" yazdiralim
    2.satir nufus kolonuna 1500000 yazdiralim
    10.satir nufus kolonuna 250000 yazdiralim
    15.satir nufus kolonuna 54000 yazdiralim
    Dosyayi kaydedelim
    Dosyayi kapatalim
     */




        /*
    sayfaya gidin cerezi kapatin
    https://www.mercedes-benz.com.tr/?group=all&subgroup=see-all&view=BODYTYPE
     */








    }

    @Test
    public void test04() throws IOException {

          /*
    ODEV2
    Yeni bir test method olusturalim writeExcelTest()
    Adimlari takip ederek 1.satira kadar gidelim
    5.hucreye yeni bir cell olusturalim
    Olusturdugumuz hucreye "Nufus" yazdiralim
    2.satir nufus kolonuna 1500000 yazdiralim
    10.satir nufus kolonuna 250000 yazdiralim
    15.satir nufus kolonuna 54000 yazdiralim
    Dosyayi kaydedelim
    Dosyayi kapatalim
     */


        String dosyaYolu = "src/test/java/Practice_10/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1500000");
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("250000");
        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue("54000");

        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        fos.close();
        workbook.close();







    }










}
