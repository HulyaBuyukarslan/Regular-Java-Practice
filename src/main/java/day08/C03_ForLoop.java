package day08;

import java.util.Scanner;

public class C03_ForLoop {
    /*
     Kullanicidan bir cumle ve bir harf alin,
     Cumlede verilen harfin kac kere
     kullanildigini bulup, yazdirin
     ORNEK:
     INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
     OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle=input.nextLine().toLowerCase();
        System.out.println("Lutfen saydirmak istediginiz harfi giriniz");
        char harf=input.next().toLowerCase().charAt(0);
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede "+harf+ " harfi "+sayac+ " tanedir");
    }
}


