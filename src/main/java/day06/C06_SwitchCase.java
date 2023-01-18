package day06;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {


//Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
//Ex : 568
//Besyuzaltmissekiz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        int birlerBas = (sayi % 10);
        int onlarBas = (sayi / 10) % 10;
        int yuzlerBas = (sayi / 100) % 10;

        if (sayi > 99 && sayi < 1000) {
            switch (sayi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("İki Yuz");
                    break;
                case 3:
                    System.out.print("UcYuz");
                    break;
                case 4:
                    System.out.print("Dort Yuz");
                    break;
                case 5:
                    System.out.print("Bes Yuz");
                    break;
                case 6:
                    System.out.print("Alti Yuz");
                    break;
                case 7:
                    System.out.print("Yedi Yuz");
                    break;
                case 8:
                    System.out.print("Sekiz Yuz");
                    break;
                case 9:
                    System.out.print("Dokuz Yuz");
                    break;
            }


            switch (onlarBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }

            switch (birlerBas) {

                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("Alti");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;
            }

        }else System.out.println("Lutfen  3 basamakli bir sayi giriniz");

    }
}
