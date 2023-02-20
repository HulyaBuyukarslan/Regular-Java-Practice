package day10;

import java.util.ArrayList;
import java.util.List;


public class C01_Arrays {

        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz
        public static void main(String[] args) {
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            nums.add(9);
            nums.add(10);
            System.out.println("Listenin ilk hali "+nums);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            //[2, 4, 6, 8, 10, 12, 17, 16, 9, 10]
            for (int i = 0; i <nums.size() ; i++) {
                if(nums.get(i) ==8){
                    nums.set(i,nums.get(i)*2);;//bu kod sadece ==8 icin calisiyor 8'i dahil edebilmek
                    // ve sonrasini loop disina atabilmek icin
                    break;
                }
                nums.set(i,nums.get(i)*2);//8'i gormediyse bu kod calissin
            }
            System.out.println("degistirilmis hali "+nums);//[2, 4, 6, 8, 10, 12, 14, 16, 9, 10]
        }
    }

