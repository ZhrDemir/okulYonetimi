package okulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ogrenci {//implements ogrenciDepo{
    
    static Scanner scan = new Scanner(System.in);
    static String  secim = "";


    public static void islemlerMenu(){
        System.out.println("\t\t     ============= İŞLEMLER =============\n" +
                "                1-EKLEME\n" +
                "                2-ARAMA\n" +
                "                3-LİSTELEME\n" +
                "                4-SİLME\n" +
                "                Q-ÇIKIŞ\n" +
                "             ====================================\n");
    }
    protected static void ogrenciIslemleri() {
        islemlerMenu();
        try {

            System.out.println("Lütfen seçiminizi yapınız.");
            secim = scan.nextLine();

            switch (secim){
                case "1":
                    ogrEkleme();
                    ogrenciIslemleri();
                    break;
                case "2":
                    ogrArama();
                    ogrenciIslemleri();
                    break;
                case "3":
                    ogrListeleme();
                    ogrenciIslemleri();
                    break;
                case "4":
                    ogrSilme();
                    ogrenciIslemleri();
                    break;
                case "Q":
                case "q":
                    System.out.println("Ana menüye yönlendiriliyorsunuz...");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız...");
                    ogrenciIslemleri();
            }

        }catch (InputMismatchException e){
            System.out.println("Yanlış giriş yaptınız...");
            ogrenciIslemleri();
        }
    }




    private static void ogrEkleme() {

    }
    private static void ogrArama() {

    }

    private static void ogrListeleme() {
    }

    private static void ogrSilme() {
    }




}
