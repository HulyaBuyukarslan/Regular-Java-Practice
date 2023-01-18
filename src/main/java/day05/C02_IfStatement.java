package day05;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

// Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi pozitif olarak giriniz");
        int yas = input.nextInt();
        int sene = 65 - yas;
        if (yas > 64) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(sene + "  sene calisman lazim");


// nested if else

            if (yas >= 0) {
                if (yas >= 65) {
                    System.out.println("Emekli Olabilirsin");
                } else {
                    System.out.println(" Emekli olamazsin...");
                    System.out.println(65 - yas + " sane daha calismalisin...");
                }

            } else {
                System.out.println(" Lutfen  sifirdan buyuk bir sayi giriniz");
            }


        }
    }

}

