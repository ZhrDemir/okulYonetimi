package okulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;


import static okulYonetimi.ogrenci.ogrenciIslemleri;
import static okulYonetimi.ogretmen.ogretmenIslemleri;

public class  menu {

    static Scanner scan = new Scanner(System.in);
    static String secim="";
    public static void anaMenu(){

        System.out.println(" \t\t   ====================================\n" +
                "            ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "           ====================================\n" +
                "           1- ÖĞRENCİ İŞLEMLERİ\n" +
                "           2- ÖĞRETMEN İŞLEMLERİ\n" +
                "           Q- ÇIKIŞ\n"+
                "           ====================================\n\n");

        try {

            System.out.println("Lütfen seçiminizi yapınız.");
            secim = scan.nextLine();

            switch (secim){
                case "1":
                    ogrenciIslemleri();
                    anaMenu();
                    break;
                case "2":
                    ogretmenIslemleri();
                    anaMenu();
                    break;
                case "Q":
                case "q":
                    System.out.println("Programdan çıkıyorsunuz...");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız...");
                    anaMenu();
            }

        }catch (InputMismatchException e){
            System.out.println("Yanlış giriş yaptınız...");
            anaMenu();
        }
    }

}
