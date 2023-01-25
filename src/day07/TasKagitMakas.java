package day07;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

        // Bilgisayara karsi tas kagit makas oyunu oynayin
        // 5 puana ilk ulasan oyunu kazanir

        int comPuan=0;
        int playerPuan=0;

        do{
            Scanner scan=new Scanner(System.in);
            System.out.println(" Asagidakilerden birini seciniz\n " +
                            "1 - Tas 2 - Kagit 3 - Makas");
            int playerChoice= scan.nextInt();

            Random rnd=new Random();
            int comChoice= rnd.nextInt(3)+1;
            System.out.println("Bilgisayarın seçimi: "+comChoice);

            switch (comChoice){
                case 1:
                    System.out.println("======== Bilgisayar = Tas ========");
                case 2:
                    System.out.println("======== Bilgisayar = Makas ========");
                case 3:
                    System.out.println("======== Bilgisayar = Kağıt ========");
            }
            switch (playerChoice){
                case 1:
                    System.out.println("======== Oyuncu = Tas ========");
                case 2:
                    System.out.println("======== Oyuncu = Makas ========");
                case 3:
                    System.out.println("======== Oyuncu = Kağıt ========");
            }

            if (playerChoice==1 && comChoice==2){
                System.out.println("Kagit Tasi sarar! -- Bilgisayar +1 --");
                comPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else if (playerChoice==1 && comChoice==3){
                System.out.println("Tas Makasi kirar! -- Oyuncu +1 --");
                playerPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else if (playerChoice==2 && comChoice==1){
                System.out.println("Kagit Tasi sarar! -- Oyuncu +1 --");
                playerPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else if (playerChoice==2 && comChoice==3){
                System.out.println("Makas Kagidi keser! -- Bilgisayar +1 --");
                comPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else if (playerChoice==3 && comChoice==1){
                System.out.println("Tas Makasi kirar! -- Bilgisayar +1 --");
                comPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else if (playerChoice==3 && comChoice==2){
                System.out.println("Makas Kagidi keser! -- Oyuncu +1 --");
                playerPuan++;
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);

            }else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu = " + playerPuan + " // Bilgisayar = "+ comPuan);
            }
        }while(comPuan!=5 && playerPuan!=5);

        if (playerPuan>comPuan)

            System.out.println("====================================" +
                    "Sen kazandin!!!!!!" +
                    "==================================");
        else
            System.out.println("====================================" +
                    "Malesef kaybettin!!!!!!" +
                    "===================================");

    }
}
