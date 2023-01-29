package day09;

import java.util.Scanner;

public class C03_NestedForLoop {

    //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen agacin tac uzunlugunu giriniz ");
        int tacUzunluk=input.nextInt();
        String yaprak="";
        for (int i = 0; i <tacUzunluk ; i++) {
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("|||");
        }
    }
}
