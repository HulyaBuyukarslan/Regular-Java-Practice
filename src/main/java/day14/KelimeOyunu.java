package day14;

import java.util.Scanner;

public class KelimeOyunu {
 /* Iki kisinin oynayacagi bir kelime oyunu uretelim
              *      Kurallar
              *      1) Baslangicta 1.oyuncudan bir kelime girmesini isteyin
              *         ve kelimeyi yazdirin
              *          1.oyuncu kelimeyi girince; 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
              *      2)  * Eger kelimeye
              *          2.oyuncu Evet derse, kabul ederse 2.oyuncuya tamamMi devam Mi? diye sorun
              *          2.oyuncu Evet ,devam derse kelimeye eklemek icin bir String isteyin ve bunu
              *          basa mi sona mi ekleyecegini sorun aldiginiz string'i kelimeye ekleyip
              *          1.oyuncuya girilen Stringi kabul edip etmedigini sorun
              *          *Eger kelime oyununa  2.oyuncu Hayir devam etmiycem tamam derse 1.oyuncuya girdigi kelimenin harf sayisi
                          kadar puan verin "Oyun bitti" yazin
              *          Kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
              */



    static int oyuncu=1;
    static int puan1=0;
    static int puan2=0;
    static String kelime="";
    static  String ekleme="";
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println(oyuncu+".oyuncu bir kelime giriniz");
        kelime=input.next();//oyuncunu verdigi kelimeyi class levelda hiclik olarak atamistik

        oyuncuDegistir();//oyuncu degistirme methodu
        onaySor();
    }

    public static void onaySor() {
        System.out.println("Girilen kelime "+kelime);
        System.out.println(oyuncu+" .oyuncu girilen kelimeyi kabul ediyormusunuz: \n 1: Evet \n 0 Hayir");

        int kabul=input.nextInt();
        if(kabul==1) {//1 tercihi girilen kelimeyi kabiul ettigini gosterir
            if(oyuncu==1){//islemi yapan 1.oyuncu ise
                puan2+=kelime.length();

            }else
                puan1+=kelime.length();
            oyunaDevamEdecekMi();



        }else oyunuBitir();// girilen kelimeyi kabul etmiyor

    }

    private static void oyunaDevamEdecekMi() {

        System.out.println("oyuna devam etmek istiyormusunuz 1: Evet 0: Hayir");
        int tercih=input.nextInt();
        if(tercih==1) {//1 ise devam
            kelimeEkle();
        }else {
            System.out.println("Oyun Bitti");
            System.out.println("Havva hanimin puani "+puan1);
            System.out.println("Goksel beyin puani "+puan2);
            if(puan1>puan2){
                System.out.println("Kazanan Havva hanim");
            }else if(puan2>puan1){
                System.out.println("Kazana Goksel bey");
            }else
                System.out.println("Oyun berabere");
        }
    }

    private static void kelimeEkle() {
        System.out.println("Eski kelimeye eklenecek str giriniz");
        ekleme=input.next();
        System.out.println("Yeni str'i basa mi sona mi ekliyelim ?\n 1: basa ekle 0: sona ekle");

        int tercih=input.nextInt();
        if(tercih==1) {
            kelime = ekleme + kelime;
        }else kelime=kelime+ekleme;
        oyuncuDegistir();
        onaySor();

    }

    private static void oyunuBitir() {
        System.out.println("Oyunu "+oyuncu+" .oyuncu kazandi ");
    }

    public static void oyuncuDegistir() {
        if(oyuncu==1){//havva
            oyuncu=2;//goksel bey
        }else
            oyuncu=1;
    }


}
