package day06;

import java.util.Locale;
import java.util.Scanner;

public class Q1_BirimDonusturucu {
    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen saati saniyeye çevirmek için S'ye\n" +
                "Mili kilometreye çevirmek için M'ye\n" +
                "Kilogramı grama çevirmek için K'ye basınız:");
        char islem=scan.nextLine().toUpperCase().charAt(0);

        System.out.println("Lütfen ölçüyü giriniz: ");
        double olcu= scan.nextInt();


        donusuturucu(islem,olcu);
    }

    private static void donusuturucu(char islem, double olcu) {

        switch (islem){

            case 'S':
                System.out.println(olcu+" saat "+olcu*3600+" saniyedir.");
                break;
            case 'M':
                System.out.println(olcu+" mil "+1.6*olcu+" kilometredir.");
                break;
            case 'K':
                System.out.println("olcu "+1000*olcu+" gramdır.");
                break;
            default:
                System.out.println("Lütfen S, M ya da K yazınız!");





    }


}




    }

