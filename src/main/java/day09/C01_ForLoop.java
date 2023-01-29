package day09;

import java.util.Scanner;

public class C01_ForLoop {
      /*
            Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz..");
        String str=input.nextLine();

        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)=='a'){

                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }

        }
        System.out.println("'c' oncesi 'a'larin sayisi "+ sayac);

    }
}


