package day03;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {


        char harf='a';
        char harf2='A';
        System.out.println("harf>harf2 ==> "+(harf>harf2));// true karsilastirma islemlerinin sonucunu boolean true yada false doner
        //Buyuk harflerin ASCII Degerleri Kucuk harflarin Ascii degerlerinden daha kucuktur.
        //1) herhangi bir char variable'in ASCII degerlerini kod yazarak bulunuz.
        //1. YOL
        char space=' ';
        System.out.println("Space'in ASCII degeri : "+(space+0));//32 space'in ASCII degerini hesaplamak icin toplamaya etkisi olmayan '0'
        //seceriz.Boylece yazdirdigimiz deger bize space 'in ASCII degerini verir.
        char m='m';
        System.out.println("m'nin ASCII degeri : "+(m+0));//109
        //2.yol
        //char'larda Java char karaktere  int 'da atayabiliriz.
        // Cunku char'in bir resim karakteri birde matematiksel ASCCII degeri vardir.
        // Bu nedenle ASCII degerlerini hesaplayabiliriz.
        int harf3='m';
        System.out.println("m'nin ASCII degeri = " + harf3);//109
        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1>b2 ==> "+(b1>b2));//true
        float f1 = 2.45645f;
        float f2 = 5.86786F;
        System.out.println(" f1>f2 ==> "+(f1>f2));//false
        System.out.println("b1> f1 ==> "+(b1 > f1));//true
        long lng1 = 5456456464L;
        System.out.println("b1<lng1 ==> "+(b1<lng1));//true
        char ch='h';
        System.out.println("b1> ch ==> "+(b1>ch));//false
    }

}
