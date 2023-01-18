package day06;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
//
//        DERS PROGRAMI
//
//        Hangi gun hangi dersin oldugunu gosteren bir program yaziniz
//
//        Pazartesi ve Sali ise: Java
//
//        Persembe ve Cuma ise: Selenyum
//
//        Carsamba ve Cumartesi ise: SQL
//
//        aksi halde: izin gunu=Day Of
//


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen gun ismini giriniz");
        String gun = input.next().toUpperCase();
//
//        switch (gun){
//
//            case "pazartesi":
//            case    "sali" :
//                System.out.println("Java");
//                break;
//            case "persembe" :
//            case "cuma"  :
//                System.out.println("Selenyum");
//                break;
//            case "carsamba" :
//            case "cumartesi" :
//                System.out.println("SQL");
//                break;
//            default:
//                System.out.println("day Off");
//        }
//    }

        switch (gun) {

            case "PAZARTESI" :
            case "SALI":
                System.out.println("JAVA");
                break;

            case "PERSEMBE":
            case "CUMA":
                System.out.println("SELENYUM");
                break;
            case "CARSAMBA" :
            case "CUMARTESI":
                System.out.println("SQL");
                break;
            default:
                System.out.println("DAY OFF");

        }


    }

}

