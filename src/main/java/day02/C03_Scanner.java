package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {



        /*  Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = input.next();*/
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Cemberin Yaricapini giriniz = ");
        double r= scan.nextDouble();
        System.out.println(" Cemberin Cevresi = "+2*314*r/100);
        System.out.println("Dairenini Alani = "+314*r*r/100);*/
        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
        // cevre hesabini yapan bir program yaziniz.
      /*  Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen kisa kenar uzunlugunu giriniz = ");
        double kisa=scan2.nextDouble();
        System.out.println("Lutfen uzun kenar uzunlugunu giriniz = ");
        double uzun=scan2.nextDouble();
        System.out.println("Dikdortgenin Alani : "+kisa*uzun);
        System.out.println("Dikdortgenin Cevresi = "+(2*kisa+2*uzun));  */
        //Soru 3) Kenar uzunluklari kullanicidan alinan bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        // Ucgenin cevresi=a+b+c
       /* Scanner scan3=new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz ");
        byte a=scan3.nextByte();
        byte b=scan3.nextByte();
        byte c=scan3.nextByte();
        int cevre=a+b+c;
        System.out.println("Ucgenin Cevresi = "+cevre);*/
        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz
     /*
                  A
                 A A
                A A A
         */
        Scanner scan4=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ");
        char ch=scan4.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);
    }
}
