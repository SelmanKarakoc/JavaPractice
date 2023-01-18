package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_ArraylerinOrtakElemanlariniBulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {

        String[] Input1= {"John","Brad","Angel","Sofia","Emily"};
        String[] Input2= {"sofia","brad","grace","emily","hazel"};
        List<String> ortakEleman=new ArrayList<>();

        System.out.println(Arrays.toString(Input1));
        System.out.println(Arrays.toString(Input2));

        for (int i = 0; i < Input1.length; i++) {
            for (int j = 0; j < Input2.length; j++) {

                if (Input1[i].equalsIgnoreCase(Input2[j]))
                    ortakEleman.add(Input1[i]);

            }

        }

        System.out.println("Ortak isimler: "+ortakEleman);












    }
}
