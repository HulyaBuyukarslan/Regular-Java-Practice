package day15;

import java.util.InputMismatchException;
import java.util.Scanner;
    public class C02_TryCatch {
        /*
          /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
        (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
         */
        public static void main(String[] args) {
            String [] urunler ={"Et","Sut","Findik","Fistik"};
            Scanner input ;
            int index=0;
            try {
                input=new Scanner(System.in);
                System.out.println("Istediginiz urunun sira numarasini giriniz ");
                index=input.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
            System.out.println(urunler[index]);
        }
    }
