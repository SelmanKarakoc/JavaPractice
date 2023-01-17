package day03;

import java.util.Scanner;

public class Q1_DikUcgen {
    /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz: 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Dik ucgen olup olmadigini anlamak icin 3 kenar uzunlugu giriniz : ");

        System.out.print("Birinci kenar uzunlugunu giriniz : ");
        int kenar1 = scan.nextInt();

        System.out.print("Ikinci kenar uzunlugunu giriniz : ");
        int kenar2 = scan.nextInt();

        System.out.print("Ucuncu kenar uzunlugunu giriniz : ");
        int kenar3 = scan.nextInt();


        if (Math.abs(kenar1-kenar2)<=kenar3 && kenar3<=kenar1+kenar2) {

            if ((kenar1 * kenar1) == (kenar2 * kenar2) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar2 * kenar2) == (kenar1 * kenar1) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar3 * kenar3) == (kenar2 * kenar2) + (kenar1 * kenar1)) System.out.println("bu bir dik üçgendir");
            else System.out.println("bu bir dik üçgen değildir.");
        }

        else  if (Math.abs(kenar3-kenar2)<=kenar1 && kenar1<=kenar3+kenar2) {

            if ((kenar1 * kenar1) == (kenar2 * kenar2) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar2 * kenar2) == (kenar1 * kenar1) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar3 * kenar3) == (kenar2 * kenar2) + (kenar1 * kenar1)) System.out.println("bu bir dik üçgendir");
            else System.out.println("bu bir dik üçgen değildir.");
        }

        else if(Math.abs(kenar1-kenar3)<=kenar2 && kenar2<=kenar1+kenar3) {

            if ((kenar1 * kenar1) == (kenar2 * kenar2) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar2 * kenar2) == (kenar1 * kenar1) + (kenar3 * kenar3)) System.out.println("bu bir dik üçgendir");
            if ((kenar3 * kenar3) == (kenar2 * kenar2) + (kenar1 * kenar1)) System.out.println("bu bir dik üçgendir");
            else System.out.println("bu bir dik üçgen değildir.");
        }
        else System.out.println("bu bir üçgen değildir");





    }





}
