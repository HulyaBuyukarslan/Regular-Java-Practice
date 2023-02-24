package day16;


import java.util.HashMap;

    public class C02_Map {

    /*
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
        // input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
        // output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};
     */

        public static void main(String[] args) {

            String ad[]={"Ahmet", "Alev", "Gulay"};
            String soyAd[]= {"Yilmaz", "Erdem", "Kaleli"};
            HashMap<String,String> adSoyad =new HashMap<>();
            for (int i = 0; i <ad.length ; i++) {
                adSoyad.put(ad[i],soyAd[i]);

            }
            System.out.println("Ad Soyad "+adSoyad);

        }
    }

