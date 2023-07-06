package day21_Excel_JSExecutor;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class C05_Odev01 {

    @Test

    public void test01() throws IOException {

           /*
    ODEV1
    1.satirdaki 2.hucreye gidelim ve yazdiralim
    1.satirdaki 2.hucreyi bir string degiskene atayalim ve  yazdiralim
    2.satir 4.cell'in afganistan'in baskenti oldugunu test  edelim
    Satir sayisini bulalim
    Fiziki olarak kullanilan satir sayisini bulun
    Ingilizce Ulke isimleri ve baskentleri bir map olarak  kaydedelim
 */

        //  1.satirdaki 2.hucreye gidelim ve yazdiralim
        //  1.satirdaki 2.hucreyi bir string degiskene atayalim ve  yazdiralim
        String dosyaYolu = "src/test/java/resourses/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        String satir1sutun2 = workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();
        System.out.println(satir1sutun2);

        // 2.satir 4.cell'in afganistan'in baskenti oldugunu test  edelim
        String satir2sutun4 = workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();
        System.out.println(satir2sutun4);
        Assert.assertEquals("Kabil",satir2sutun4);

        //Fiziki olarak kullanilan satir sayisini bulun
        int kullanilanSatirSayisi = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println("Kullanilan Satir Sayisi = " + kullanilanSatirSayisi);

        //Satir sayisini bulalim
        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println("Satir Sayisi = " + satirSayisi);

        //Ingilizce Ulke isimleri ve baskentleri bir map olarak  kaydedelim
        Map<String,String> ingilizceUlkeBaskent = new LinkedHashMap<>();
        for (int i = 0; i <workbook.getSheet("Sayfa1").getPhysicalNumberOfRows() ; i++) {
            String ulke = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String baskent = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();
            ingilizceUlkeBaskent.put(ulke,baskent+"\n");
        }

        System.out.println(ingilizceUlkeBaskent);
    }
}

