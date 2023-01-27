package day07;

public class C04_StringManipulationsStartsWith {
    public static void main(String[] args) {

        /*
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.

         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */


        String cumle = "Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";

// Ka ile basliyor mu?
        System.out.println(cumle.startsWith("Ka"));

//dir ile bitiyor mu?
        System.out.println(cumle.endsWith("dir"));
    }
}