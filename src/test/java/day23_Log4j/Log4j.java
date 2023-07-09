package day23_Log4j;

public class Log4j {

       /*
Her yazdigimiz kodla alakali bilgi yazdirabiliriz.
extent reporttaki gibi loger objesi olusturup infoyla task altina info yazdirabiliriz
her task altina bilgilendirme objesi eklenebilir.
ekstra olarak bir rapor dosayi gibi log dosyasinda tarih saat olarak tutuyor olmasidir. souttan farki bu
2 farkli dependdencies yükleyerek class'imiza tanimlayacagiz. her taskten sonra rapor yazabiliriz.

log4j nedir?
-------------

Log4J bilgilerini console a yada bir dosyaya loglamak (yazdırmak) icin
kullanılan bir API dir

Log4J bilgi, hata, yada debug mesajlarını yazdırmak için kullanılabilir
System.out.print fonksiyonuna çok benzerdir, fakat kullanımı icin log4j dependency gerekmektedir.

Neden log4j kullanılır?

Farkli log'lama çeşitleri vardır
Fatal logs: logger.fatal ("This is fatal logger"); :logger.error('This is error logger");
Error logs:logger.debug("This is debug logger");

Informational logs: logger.info("This is info logger");
> Debug logs

Loglama anındaki zaman bilgisini alınabilir
Dosyaya kalici olarak loglama işlemi yapılabilir

1. Dependencileri ekle

2. Class olustur: Log4j

3. Logger object olustur:
Loglamayı kullanabilmek için gerekli dependency
Kayıtları oluşturmak ve yönetmek için gerekli dependency

private static Logger logger = LogManager.getLogger(Demol.class.getName()); 4. Logger
fonksiyonuyla istenilen fonksiyonu kullan

logger.debug("Debug logger"); logger.info("Info logger");
logger.error("Error logger"); logger.fatal ("Fatal logger");

5. Consoldeki loglari kontrol edelim. Default olarak error or fatal gorunmus olacaktır
     */



}
