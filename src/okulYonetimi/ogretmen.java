package okulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ogretmen {//implements ogretmenDepo{

    static Scanner scan = new Scanner(System.in);
    static String secim="";

    protected static void ogretmenIslemleri() {
       ogrenci.islemlerMenu();

        try {

            System.out.println("Lütfen seçiminizi yapınız.");
            secim = scan.nextLine();

            switch (secim){
                case "1":
                    ekleme();
                    ogretmenIslemleri();
                    break;
                case "2":
                    arama();
                    ogretmenIslemleri();
                    break;
                case "3":
                    listeleme();
                    ogretmenIslemleri();
                    break;
                case "4":
                    silme();
                    ogretmenIslemleri();
                    break;
                case "Q":
                case "q":
                    System.out.println("Ana menüye yönlendiriliyorsunuz...");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız...");
                    ogretmenIslemleri();
            }

        }catch (InputMismatchException e){
            System.out.println("Yanlış giriş yaptınız...");
            ogretmenIslemleri();
        }

    }

    public static void ekleme(){

    }

    public static void arama(){

    }

    public static void listeleme(){

    }

    public static void silme(){

    }


}
