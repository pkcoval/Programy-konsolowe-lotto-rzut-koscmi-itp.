package Zad2;

import java.util.*;



public class Main1 {

    public static void main(String[] args) {

        Integer[] liczbyWylosowane = new Integer[49];
        for (int i = 0; i < liczbyWylosowane.length; i++) {
            liczbyWylosowane[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(liczbyWylosowane));

        Scanner konsola = new Scanner(System.in);
        int [] liczbyWybrane = new int[6];
        int liczbaWYBRANA = 0;
        int liczbaTrafien = 0;


        System.out.println("Podaj 6 liczb z zakresu 1-49");

        List<Integer> listaWybrana = new ArrayList<>();



        while (konsola.hasNextLine() && listaWybrana.size()<6){

            String s = konsola.nextLine();

                try {
                        liczbaWYBRANA = Integer.parseInt(s);
                }catch (NumberFormatException e){
                    System.out.println("Podaj liczbe!!!");
                }

                if (liczbaWYBRANA < 49 && liczbaWYBRANA >= 1  ) {

                    if (!listaWybrana.contains(liczbaWYBRANA)) {

                        listaWybrana.add(liczbaWYBRANA);
                    } else {
                        System.out.println("Podales juz taka liczbe");
                    }

                }else {
                    System.out.println("Podaj liczby z zakresu 1-49!!!");
                }

        }
        liczbyWybrane [0] =listaWybrana.get(0);
        liczbyWybrane [1] =listaWybrana.get(1);
        liczbyWybrane [2] =listaWybrana.get(2);
        liczbyWybrane [3] =listaWybrana.get(3);
        liczbyWybrane [4] =listaWybrana.get(4);
        liczbyWybrane [5] =listaWybrana.get(5);
        Arrays.sort(liczbyWybrane);

        System.out.println("Twoje wybrane liczby to: ");
       for(int i = 0; i < liczbyWybrane.length; i++){
           System.out.print( liczbyWybrane[i] + ", ");
       }

        System.out.print( "\n ");

        System.out.println("Liczby wylosowane to: ");
        int [] tabWylosowana = new int[6];

        tabWylosowana [0] = liczbyWylosowane [0];
        tabWylosowana [1] = liczbyWylosowane [1];
        tabWylosowana [2] = liczbyWylosowane [2];
        tabWylosowana [3] = liczbyWylosowane [3];
        tabWylosowana [4] = liczbyWylosowane [4];
        tabWylosowana [5] = liczbyWylosowane [5];
        Arrays.sort(tabWylosowana);


        for(int f = 0; f < tabWylosowana.length; f++) {
            System.out.print(tabWylosowana[f] + ", ");
        }

            for(int j = 0; j < tabWylosowana.length; j++){

                if(tabWylosowana[j] == liczbyWybrane [0]){
                    liczbaTrafien++;
                }
                if(tabWylosowana[j] == liczbyWybrane [1]){
                    liczbaTrafien++;
                }
                if(tabWylosowana[j] == liczbyWybrane [2]){
                    liczbaTrafien++;
                }
                if(tabWylosowana[j] == liczbyWybrane [3]){
                    liczbaTrafien++;
                }
                if(tabWylosowana[j] == liczbyWybrane [4]){
                    liczbaTrafien++;
                }
                if(tabWylosowana[j] == liczbyWybrane [5]){
                    liczbaTrafien++;
                }
            }


        System.out.print( "\n ");
        System.out.println("Trafiles " + liczbaTrafien );
    }
}
//        Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.
//        Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.
//        Napisz program, który:

//        zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
//        czy wprowadzony ciąg znaków jest poprawną liczbą,
//        czy użytkownik nie wpisał tej liczby już poprzednio,
//        czy liczba należy do zakresu 1-49,
//        po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
//        wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
//        poinformuje gracza, czy trafił przynajmniej "trójkę".

