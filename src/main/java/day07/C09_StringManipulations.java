package day07;

public class C09_StringManipulations {
    public static void main(String[] args) {



/*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
        String pwd = "java1234*4.";
        //i)En az 8 character icermeli
        boolean kural1 = pwd.length() > 7;
        //ii)Space characteri icermemeli
        boolean kural2 = !pwd.contains(" ");
        //iii)Buyuk harf icermemeli
        boolean kural3 = !pwd.contains("[A-Z]");
        //iv)Son characteri "." olmali
        boolean kural4 = pwd.charAt(pwd.length()-1) == '.';
        System.out.println(kural1 && kural2 && kural3 && kural4);//true
    }
}
