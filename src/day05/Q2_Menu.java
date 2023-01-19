package day05;

import java.util.Arrays;

public class Q2_Menu {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted


        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */

        String[][] food={{"steak","hot dog","cheese burger"},{"pizza","pasta","canoli"},
                {"sushi","ramen","fried rice","dumplings"},{"kebab","manto"},
                {"beriyani","masal","curry","chicken tikka masala"}};
        String[] ulkeler ={"american","italian","asian","afghani","indian"};

        for (int i = 0; i < food.length; i++) {

            System.out.println("----------- " + ulkeler[i] + " ------------" );
            String[] menu = food[i];

            for (int j = 0; j < menu.length; j++) {

                String yemek=menu[j];
                System.out.println(yemek);

            }

        }

        }
    }

