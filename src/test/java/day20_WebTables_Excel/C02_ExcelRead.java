package day20_WebTables_Excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ExcelRead {

    @Test
    public void excelReadTest1() throws IOException {

        // excel dosyasından veri okuyabilmemiz icin;
        // 1- dosya yolunu alırız
        String dosyaYolu = "src/test/java/resourses/Capitals (2).xlsx";

        // 2- Capitals dosyasını bizim sistemimize getirmeliyiz. Dosyayı okuyabilmek icin akışa almalıyız.
        FileInputStream fis = new FileInputStream(dosyaYolu);


        // 3- dosyayı workbook'a atamalıyız. Java ortamında bir excel dosyası olusturmalıyız.
        Workbook workbook = WorkbookFactory.create(fis);


        // 4- sayfayı(sheet) secmeliyiz
        Sheet sheet = workbook.getSheet("Sheet1");


        // satırı(row) secmeliyiz
        Row row = sheet.getRow(0);  // 1.satır, index 0 dan baslar.




        // hücreyi(cell) secmeliyiz
        Cell cell = row.getCell(0);  // 1.sütun, index 0 dan baslar.

    }

    @Test
    public void test02() throws IOException {


        // KISA YÖNTEM

        // 1.satır 1.sütundaki bilgiyi yazdırınız

        String dosyaYolu = "src/test/java/resourses/Capitals (2).xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);

        String satir1Sutun1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();

        System.out.println(satir1Sutun1);

    }

    @Test
    public void test03() throws IOException {

        //1. satır 2. sutundaki hücreyi yazdırın

        String dosyaYolu = "src/test/java/resourses/Capitals (2).xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);

        String satir1Sutun2 = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();
        System.out.println(satir1Sutun2);






    }
}
