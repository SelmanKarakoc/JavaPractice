package day05;

import java.util.Arrays;

public class Q3_KelimeyiHarflerineAyirma {
    public static void main(String[] args) {
         /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */

        String str="Selman";

        kelimeyiHarflereAyirma(str);



    }

    private static void kelimeyiHarflereAyirma(String str) {

        char [] krktr=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {

            krktr[i]=str.charAt(i);


        }
        System.out.println(Arrays.toString(krktr));




    }
}
