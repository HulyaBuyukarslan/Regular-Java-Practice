package day15;

public class C01TryCatch {
    public static void main(String[] args) {
        // Verilen iki sayiyi 10 kez bolen kodu yaziniz
        int sayi1 = 100;
        int sayi2 = 5;
        int sayac = 1;
     /*   while (sayac<10){
            System.out.println(sayi1/sayi2);
            sayi2--;
            sayac++;
        }*/
        System.out.println("********IF ELSE ILE**********");
      /*  while (sayac < 10) {
            if (sayi2 == 0) {
                System.out.println(" Islem yapillirken payda sifir oldu ");
            } else {
                System.out.println(sayi1 / sayi2);
            }
            sayi2--;
            sayac++;
        }*/
        System.out.println("********************TRY CATCH *****************");
        int a=100;
        int b=5;
        int sayac2=1;
        while (sayac2<10){
            try {
                System.out.println(a/b);//ctrl+alt+ t
            } catch (ArithmeticException osman) {
                System.out.println("Payda sifir oldu");
            }
            b--;
            sayac2++;
        }
    }//main
}//class
