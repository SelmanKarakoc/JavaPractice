package day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    public static void main(String[] args) {
        System.out.println("Lütfen bir sayi giriniz:");
        Scanner scan=new Scanner(System.in);
        int girilenSayi=scan.nextInt();

        System.out.println("****************** IF Cozumu ********************");

        if (girilenSayi>=0)
            if (girilenSayi<10) System.out.println("Rakam");
            else System.out.println("Pozitif Sayi");

        else System.out.println("Negatif Sayi");

        System.out.println("****************** Ternary Cozumu ********************");

        System.out.println(girilenSayi>=0 ? (girilenSayi<10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi" );

        //  String result =(girilenSayi>=0) ? ( (girilenSayi<10) ? "Rakam" : "Pozitif Sayi") : ("Negatif Sayi");
        //        System.out.println(result);
    }
}
