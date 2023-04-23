package day14_FakerClass_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_Faker {
    //"https://facebook.com"  Adresine gidin
    //“create new account”  butonuna basin
    //“firstName” giris kutusuna bir isim yazin
    //“surname” giris kutusuna bir soyisim yazin
    //“email” giris kutusuna bir email yazin
    //“email” onay kutusuna emaili tekrar yazin
    //Bir sifre girin
    //Tarih icin gun secin
    //Tarih icin ay secin
    //Tarih icin yil secin
    //Cinsiyeti secin
    //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    //Sayfayi kapatin
    @Test
    public void name() {

        //1. Faker objesi oluştururuz
        Faker faker = new Faker();
        //YA DA Faker.instance() statik methodu ile de kullanabiliriz "Faker.instance().name().firstName()"
        //Faker.instance();
        //Firstname yazdıralım
        System.out.println("Fake firstname : "+faker.name().firstName());
        System.out.println(Faker.instance().name().firstName());
        //Lastname yazdıralım
        System.out.println(faker.name().lastName());
        //Kullanıcı adi yazdıralım
        System.out.println(faker.name().username());
        //Meslek ismi yazdıralım
        System.out.println(faker.name().title());
        System.out.println(faker.job().position());
        //Şehir ismi yazdıralım
        System.out.println(faker.address().city());
        //Ulke ismi yazdıralım
        System.out.println(faker.address().country());
        //adress yazdıralım
        System.out.println(faker.address().fullAddress());
        //telefon numarası
        System.out.println(faker.phoneNumber().cellPhone());
        //zipcode numarası
        System.out.println(Faker.instance().address().countryCode());
        System.out.println(faker.address().zipCode());
        //Rastgele 15 haneli bir numara
        System.out.println(faker.number().digits(15));
        //email adress
        System.out.println(Faker.instance().internet().emailAddress());
    }


}
