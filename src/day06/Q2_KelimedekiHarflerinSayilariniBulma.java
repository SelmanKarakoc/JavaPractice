package day06;

public class Q2_KelimedekiHarflerinSayilariniBulma {
    public static void main(String[] args) {
        /*
         * Interview question
         *
         * write a return method that can find the frequency of characters (with case
         * sensitivity)
         *
         * Input = AAABBCDD output = A3B2C1D2
         */

        String input="AAABBCDD";


        System.out.println(kacHarfVar(input));
    }

    private static String kacHarfVar(String input) {
        String[] bos=input.split("");
        String sonuc="";
        int sayac=0;

        for (int i = 0; i < bos.length; i++) {

            for (int j = 0; j < bos.length; j++) {

                if (bos[i].equals(bos[j])){
                    sayac++;
                }

            }
            if (!sonuc.contains(bos[i])){

                sonuc=sonuc+bos[i]+sayac;
            }
            sayac=0;







        }

return sonuc;
    }
}
