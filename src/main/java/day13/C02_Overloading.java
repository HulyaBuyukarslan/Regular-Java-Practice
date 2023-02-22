package day13;

public class C02_Overloading {

    //Ayni classta birden cok ayni isme sahip metodlarin olusturulmasi ile yapilir.
    //Method imzasi nasil degistirilir

    public static void main(String[] args) {
        cikarma(96,51);
        cikarma(96.8,10);
        cikarma(968, (float) 5.6664);
        toplama(558,69);
        toplama(698,23,-45);
        carpma(5.6,23);
        carpma(80,7.36);
    }
    //1-parametrelerin data type degistirilerek
    public static void cikarma ( int a, int b) {
        System.out.println("Iki Integer Ile Cikarma " + (a - b));
    }
    public static void cikarma ( double a, int b) {
        System.out.println("Ilki Double Ikincisi Integer Ile Cikarma " + (a - b));
    }
    public static void cikarma ( int a, float b) {
        System.out.println("Ilki Integer Ikincisi Float Ile Cikarma " + (a - b));
    }
    //2-parametrelerin sayisi artirilarak
    public static void toplama ( int a, int b) {
        System.out.println("2 Integer Sayiyi Toplama " + (a + b));
    }
    public static void toplama ( int a, int b, int c) {
        System.out.println("3 Integer Sayiyi Toplama " + (a + b + c));
    }
    // 3-)data turleri farkli oldugunda parametrelerin sirasini degistirerek
    public static void carpma ( double a, int b) {
        System.out.println("Ilki Double Ikincisi Integer Ile Carpma : " + (a*b));
    }
    public static void carpma ( int a,  double b) {
        System.out.println("Ilki Integer Ikincisi Double Ile Carpma : " + (a*b));
    }
}

