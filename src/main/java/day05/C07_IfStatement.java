package day05;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan dortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 1.Kenar uzunlugunu giriniz ");
        int kenar1=input.nextInt();
        System.out.println("Lutfen 2. Kenar uzunlugunu giriniz ");
        int kenar2=input.nextInt();
        System.out.println("Lutfen 3. Kenar uzunlugunu giriniz ");
        int kenar3=input.nextInt();
        System.out.println("Lutfen 4. Kenar uzunlugunu giriniz ");
        int kenar4=input.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println(" Bu Cisim bir karedir ");
        }else
            System.out.println("Kare Degildir");
    }
}
