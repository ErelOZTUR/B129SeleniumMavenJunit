package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class C03_FileExist {
    /*
    Masaüstünde "logo.jpeg" dosyası oluşturun.
    Bu dosyanın varlığını doğrulayın.
     */

    @Test
    public void fileExistTest() {
        //System.out.println(System.getProperty("user.dir"));
        // C:\Users\monster\IdeaProjects\B129SeleniumMavenJunit
        String userDIR = System.getProperty("user.dir");//C:\Users\TechProEd\IdeaProjects\B129SeleniumMavenJunit

        //IDE proje yolunu dinamik olarak verir
        System.out.println(System.getProperty("user.home"));
        //String dosyaYolu="\"C:\\Users\\monster\\Desktop\\b129.txt.txt\"";
        String farkliKisim=System.getProperty("user.home");// Her kullanıcın ana yolu farklı olduğu için farklı kısım
        String ortakKisim="\\OneDrive\\Masaüstü\\b129.txt"; // Aynı yerde oluşturulduğu için ortakKisim dedik
        String dosyaYolu= farkliKisim+ortakKisim;// Dosya yolu olarak farkli kısım ve ortakkısmı aldık
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))); //

        /*
        Fail ise: Dosya masaüstünde değil, dosya adı yanlış, yada arada onedrive gibi ekstra dosyalar olabilir.
         */

    }
}
