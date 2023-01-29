package day09;

import java.util.Scanner;

public class C05_ForLoop {

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz...");
        String str=input.nextLine();
        for (int i = 0; i <str.length() ; i++) {//ifadenin karakterlerine bakildi
            if (str.charAt(i) == 'a' || str.charAt(i)==' ')//ifadede 'a' yada ' bosluk gorursen atla
                continue;
            System.out.println(str.charAt(i));
        }
    }
}


