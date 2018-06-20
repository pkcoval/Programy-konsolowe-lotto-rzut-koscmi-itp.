package Zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {

        Random r = new Random();
        int losowa = r.nextInt(101);
        Scanner konsola = new Scanner(System.in);

        System.out.println("Zgadnij liczbę w zakresie 1-100");



        String liczbaWybrana = "";
        int liczbaWybrana2 = 0;

            while (konsola.hasNextLine()) {

                liczbaWybrana = konsola.nextLine();

                try {

                     liczbaWybrana2 = Integer.parseInt(liczbaWybrana);


                    if (!(liczbaWybrana2 == losowa)) {

                        if (liczbaWybrana2 < losowa) {

                            System.out.println("Za mało");

                        } else if (liczbaWybrana2 > losowa) {
                            System.out.println("Za duzo");
                        }
                    } else {
                        System.out.println("ZGADLES!!!");
                    }
                }catch (NumberFormatException e){
                    System.out.println("To nie jest liczba");
                }

            }

    }






    }

