package day11;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArrays {



        /*Kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan kodu yaziniz
    */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Array'in uzunlugunu giriniz ");
            int uzunluk=input.nextInt();
            int arr[]=new int[uzunluk];
            for (int i = 0; i <uzunluk ; i++) {
                System.out.println("Array'in "+( i+1)+" .elemanini giriniz");
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(" Array'in en buyuk elemani :"+arr[uzunluk-1]);//Arrayin en buyuk lemanini verir
            System.out.println(" Array'in en kucuk elemani :"+arr[0]);//Array'in en kucuk elemanini verir
            System.out.println(arr[uzunluk-1]-arr[0]);
        }
    }

