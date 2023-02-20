package day12;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_LocalDateTime {

    public static void main(String[] args) {



        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
           Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
           Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
           Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
         */
        LocalDate dogTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogTom);
        LocalDate dogVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dogVeli);
        boolean ayniMi = dogTom.isEqual(dogVeli);
        System.out.println(ayniMi);
         /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini
         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami
         YY : yilin son iki rakamini
         YYYY : Yilin tamamini
         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         hh :  12 saat dilimine gore 2 rakam olarak
         h : 12 saat dilimine gore tek rakam olanlari tek olarak
         m : minute tek rakamlari tek
         mm: tek rakamlari 08 gibi
         a yazarsak AM veya PM degerini yazar
         */
        //Iki saat dilimi arasindaki farki hesaplama
        //Japonya ile Almanya arasindaki saat farkini saat cinsinden hesaplatan kodu yaziniz
        LocalDateTime farkJaponya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime farkAlmanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark = ChronoUnit.HOURS.between(farkAlmanya, farkJaponya);
        System.out.println(fark);//7
        //Ex: Tarih 2022-10-31 ve saat 03:26:00pm.oldugunda asagidaki kod ne yazdirir?
        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");// Saat:(24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
        System.out.println(dtf.format(time.plusHours(2)));//17:26
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time.minusHours(1)));//02:26
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");// hh:12 saat dilimine gore 2 rakam olarak
        System.out.println(dtf3.format(time.minusHours(1)));//02:26:00
        //gun ay yil olarak yazdirma
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(dtf4.format(date));//01-November-22
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dtf5.format(date));//11-01-2022
        //Mevcut saat diliminden ileri geri gitme
        //Mevcut saat diliminizden 2 saat ileriyi yazdirin
        LocalTime time2 = LocalTime.now();
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(time2.plusHours(2)));//Normalde 10:48:00 eklenince 12:48:00
    }

}