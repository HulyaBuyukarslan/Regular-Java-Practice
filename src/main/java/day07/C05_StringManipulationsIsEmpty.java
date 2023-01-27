package day07;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {

        String str1 = "Hi";
        System.out.println(str1.isEmpty());

        String str2 = "";

        System.out.println(str2.isEmpty());

        String str3 = " ";
        System.out.println(str3.isEmpty());

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.


        String str4 = "Kelime";
        if (str4.isEmpty()) {
            System.out.println("bosluk var");
        } else {
            System.out.println("Bosluk yok");
        }
    }
}