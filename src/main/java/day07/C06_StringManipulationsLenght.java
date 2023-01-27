package day07;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {


/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */

// havva ==length=5
        // index = 4
        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());


        String str1 = "";

        System.out.println(str1.length());

        String str2 =" ";
        System.out.println(str2.length());

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz.");
        String isim = input.next(), soyIsim = input.next();

        if(isim.length()>soyIsim.length()){
            System.out.println("Isminiz soyisminizden uzundur ");

        }else if (isim.length()<soyIsim.length()){
            System.out.println("Soyisim uzundur isimden");
        }else if(isim.length()==soyIsim.length()) {
            System.out.println("Isim ve soyisim ayni uzunluktadir");
        } else{
            System.out.println("Hatali giris yaptiniz");
        }
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin





        System.out.println("Lutfen  4 harfli bir kelime giriniz");
        String kelime = input.nextLine();
        if(kelime.length()==4){
            System.out.println(""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));
        }

    }

}
