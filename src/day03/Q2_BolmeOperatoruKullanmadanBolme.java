package day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scan.nextInt();

        bol(a, b);
        System.out.println ( a + " / "+ b +" = " + bol(a, b));


    }

    private static int bol(int a, int b) {

        int bolum = 0;
        while (a >= b) {
            a = a - b;
            bolum++;
        }
        return bolum;

    }

}
