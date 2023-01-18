package day06;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


//    TASK :
//    Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
//    Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
//     3 basamaklı degilse çift olup olmadigini kontrol edin.
//    Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
//    Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();



        String sonuc = (sayi>0)  ? sayi>99 && sayi<1000 ? "3 basamakli" :(sayi%2==0   ?"3 basamaklı olmayan çift sayı" :"3 basamaklı olmayan tek sayi") : "Lutfen 0'dan buyuk bir sayi giriniz";
        System.out.println(sonuc);

        if(sayi>0){
            if(sayi>99 && sayi<1000){
                System.out.println("3 basamakli pozitif sayi");
            }else if( sayi%2==0){
                System.out.println("3 basamaklı olmayan çift sayı" );
            }else {
                System.out.println("3 basamaklı olmayan tek sayi");
            }
        }else {
            System.out.println("Lutfen 0'dan buyuk pozitif bir tamsayi giriniz");
        }

    }
}
