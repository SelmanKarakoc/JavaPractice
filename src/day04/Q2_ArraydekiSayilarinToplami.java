package day04;

import java.sql.Array;
import java.util.Arrays;

public class Q2_ArraydekiSayilarinToplami {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {

        float[] arr1=new float[5];

        arr1[0]=0.5f;
        arr1[1]=2.5f;
        arr1[2]=2.7f;
        arr1[3]=3.8f;
        arr1[4]=4.9f;

        System.out.println(Arrays.toString(arr1));

        float toplam=0;

        for (int i = 0; i < arr1.length; i++) {
            toplam+=arr1[i];

        }
        System.out.println("========with For loop==========");
        System.out.println("Array deki sayiların toplamı= "+ toplam);

        System.out.println("=========with While============");

        toplam=0;
        int index=0;

        while (index<= arr1.length-1){

            toplam+=arr1[index];
            index++;
        }

        System.out.println("Array deki sayiların toplamı= "+ toplam);




    }
}
