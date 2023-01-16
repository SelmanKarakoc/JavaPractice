package day02;

import java.util.Scanner;

public class Q02_SwitchCase_HesapMakinesi {
    /*
     * Kullanicidan iki tamsayi sayi ve islem cinsini alin
     * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
     *
     * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
     *
     * Ornek : Inputs : sayilar : 18 , 10  islem : 3
     *         Output : 18 X 10 = 180
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak istediğiniz iki tamsayi giriniz: \n" +
                           "işlem cinsi 1:toplama 2:çıkarma 3:çarpma 4:bölme");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int islem= scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Girilen iki sayinin toplamı= " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Girilen iki sayinin çıkarımı= " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Girilen iki sayinin çarpımı= " + (sayi1 * sayi2));
                break;
            case 4:
                try {
                    System.out.println("Girilen iki sayinin bölümü= " + (sayi1 / sayi2));
                }catch (Exception e){
                System.out.println("bölüm 0 olamaz!");}
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }

    }
}
