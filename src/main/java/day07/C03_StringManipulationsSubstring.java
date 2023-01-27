package day07;

public class C03_StringManipulationsSubstring {
    public static void main(String[] args) {


        /** substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

//10.index dahil sonuna kadar verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";


//son 10 harfi yazdirin >>>>gibi olsa:


// ilk 10 karakteri alma


// 11.ci karakterden sonuna kadar olan Stringi yazdiralim

        System.out.println(cumle.substring(10));

        System.out.println(cumle.substring(cumle.length()-9));
        System.out.println(cumle.substring(0,10));
        System.out.println(cumle.substring(10,cumle.length()));

    }
}
