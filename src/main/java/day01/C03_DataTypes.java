package day01;

public class C03_DataTypes {

    /*
     Javada temelde 2 farkli data type vardir
     1)Primitive(Ilkel) Data Type: 8 tane
     a)boolean==>true;false sadece 2 farkli deger alabilir.booleanlar sadec 2 farkli deger aldigi icin memoryde az yer kaplar1 bitlik yer kaplar
     b)char==>tek karakterli ifadeler icin kullanilir.1 char=16 bit yer kaplar.
     //char'larla matematiksel islem yaparsaniz karakterlerin ascii degerlerini kullanir
     c)byte===> -128 'dahil +127 dahil bu araliktaki tum tam sayilari icerir.memory de 8 bitlik yer kaplar
     d)short==>-32768 den 32767'e kadar tum tamsayilari(5 basamakli) icerir
     memoryde 16 bit yer kaplar
     e)int==>-2147483648'den 2147483647'e kadar tum tam sayilari icerir(10 basamakli).memoryde 32 bit yer kaplar
     f)long==>-9223372036854755808'den 9223372036854755807'e kadar tum tam sayi degerelerini alir.memoryde 64 bit yer kaplar
     g)float==>ondalikli sayilar icin kullanilan data type laridir.float memeoryde 32 bit kullanir.ondalik kisimlarinda
      en fazla 7 rakam barindirir 0.1234567 gibi
     h)double==>ondalikli sayilar icin kullanilir.memoryde 64 bit yer kaplar.
     double'lar ondalik kisimlarinda 16 rakamm barindirir 0.1234567891234567 gibi.
     Programcilar float'a gore daha fazla yer kaplasada double'i kullanir;floatta f sonuna eklemek gerektigi icin tercih edilmez
     2)Non-Primitive Data Type==> ozelligi daha fazla daha kaliteli String;Arrays;Classes;Interface
      String==> cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusur.istersen cift tirnak arasina destanda yazabilirsin
       //bit==>Memorynin en kucuk yapi tasina bit denir
       //byte==>8 bit 1 byte esittir
       boolean emeklimi=false;
       boolean sarisinmi=true;
       /*
         PRIMITIVE DATA TYPELARI ILE NON-PRIMITIVE  DATA TYPE'LARI ARASINDAKI FARKLAR NELERDIR?
         1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk
         2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
         ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
         3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
         4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
         non-primitive'lerde ise degeri ve methodlari vardir.
         5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
      */
    public static void main(String[] args) {

        int uzunluk=20;
        System.out.println("uzunluk = " + uzunluk);

        double db=0.8;
        System.out.println("db = " + db);

        String str="Sumeyye";
        System.out.println("str = " + str);
        // int 3 variable olusturun ve toplamini yazdirin
        int a=2, b=3, c=4;
        System.out.println("a+b+c = "+(a+b+c));



    }
}


