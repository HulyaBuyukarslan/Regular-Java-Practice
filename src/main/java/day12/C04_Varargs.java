package day12;

public class C04_Varargs {


    public static void main(String[] args) {
            System.out.println(a1(true, false, true, true));//3
            a2(1,2,3,4);
        }//main
        private static void a2(int i, int i1,int... i2) {
            System.out.println(i2.length);
        }
        private static int a1(boolean b, boolean... b3) {
            return b3.length;//2
        }
    }

