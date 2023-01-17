package day04;

public class C02_IfStatement {
    public static void main(String[] args) {

    /*    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
        not hesaplayici
        90 ~100 => A  Cok Iyi
        80 ~ 89 => B  Iyi
        70 ~ 79 => C  Orta
        60 ~ 69 => D  Gecer
        0 ~ 59  => F  Zayif
   */


        int not = 50;
        if (not >= 90 && not <= 100) {//90 91 92 93 .......100
            System.out.println("Notunuz A Cok Iyi");
        } else if (not < 90 && not >= 80) { //80  81 ....89
            System.out.println("Notunuz B Cok Iyi");
        } else if (not < 80 && not >= 70) { ///70  71 ...79
            System.out.println("Notunuz C Orta");
        } else if (not < 70 && not >= 60) { ///60  61 ......69
            System.out.println("Notunuz D Gecer");
        } else {
            System.out.println("Notunuz F Zayif");
        }
    }

}
