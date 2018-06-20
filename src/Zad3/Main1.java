package Zad3;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Pomysl liczbe od 0 do 1000, a ja zgadne max. w 10 probach");
        int min = 0;
        int max = 1000;
        boolean czyZgadl = false;
        int guessWzor = 0;
//        int guess = 0;
        Scanner konsola = new Scanner(System.in);

        while (czyZgadl == false){


            guessWzor = ((max - min) / 2) + min;
            System.out.println("Zgaduje " + guessWzor);

            String doPrzyrownania = konsola.nextLine();


            if("za dużo".equals(doPrzyrownania)){
                max = guessWzor;
            }else if("za mało".equals(doPrzyrownania)){
                min = guessWzor;
            }else if ("zgadłeś".equals(doPrzyrownania)){
                czyZgadl = true;
            }else {
                System.out.println("Nie oszukuj");
            }
        }

        System.out.println("Wygrałem");


    }


}
//Odwróćmy teraz sytuację z warsztatu "Gra w zgadywanie liczb":
// to użytkownik pomyśli sobie liczbę z zakresu 1-1000, a komputer będzie zgadywał i zrobi to maksymalnie w 10
// ruchach (pod warunkiem, że gracz nie będzie oszukiwał).
//
//Zadaniem gracza będzie udzielanie odpowiedzi "więcej", "mniej", "trafiłeś".
//
//Na następnym slajdzie znajduje się schemat blokowy algorytmu.