package day15;

import java.util.ArrayList;
import java.util.List;
    public class SansliKullanici {
        public void sansliKullaniciYazdir(List<String> listKullaniciID, List<Integer> listKullaniciSaniye) {
            List<String> sansliKullaniciIndexes = new ArrayList<>();
            for (int i = 0; i < listKullaniciSaniye.size(); i++) {
                if (listKullaniciSaniye.get(i) < 10) {
                    sansliKullaniciIndexes.add(listKullaniciID.get(i));
                }
            }
            System.out.println("Sansli Kullanicilar");
            System.out.println(sansliKullaniciIndexes);
        }
    }

