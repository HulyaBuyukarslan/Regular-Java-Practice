package day08;

import java.util.Scanner;

public class C04_ForLoop {
    /*
    EX :Kullanicidan bir kelime isteyiniz
     alinan kelimenin karakter dizisinin her harfi ve
     bu harfin karakter dizisi içindeki indexini birer satıra yazdirin
             ORNEK
      Bir kelime giriniz:istanbul
       Karakter        Index
         i               0
         s               1
         t               2
         a               3
         n               4
         b               5
         u               6
         l               7
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=input.nextLine();
        int index=0;
        System.out.print("\tKarakter "+ "\t Index");
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println("");
            System.out.print("\t\t"+kelime.charAt(i)+"\t\t"+index);
            index++;
        }
    }
}


