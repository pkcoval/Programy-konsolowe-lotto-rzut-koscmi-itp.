package Zad4;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Podaj rodzaj kostki, ilosc rzutow i modyfikator zgodnie z wzorem xDy+z");
        Scanner konsola = new Scanner(System.in);
        int intxdyz = 0;
        String stringXDYZ = "";
        Random r = new Random();
        int r3 = 0, r4 = 0, r6 = 0, r8 = 0, r10 = 0, r12 = 0, r20 = 0, r100 = 0, xLiczba = 1, yLiczba = 0, zLiczba = 0, i=0 ;
        String z ="", x = "";
        String [] parts2 = new String[2];



        while (konsola.hasNextLine() ) {
            stringXDYZ = konsola.nextLine();
            try {


                String[] parts1 = stringXDYZ.split("D");
                try {
                    xLiczba = Integer.parseInt(parts1[0]);
                } catch (NumberFormatException e) {

                }

                if (stringXDYZ.contains("-")) {
                    parts2 = parts1[1].split("-");
                    yLiczba = Integer.parseInt(parts2[0]);
                    try {
                        zLiczba = Integer.parseInt(parts2[1]);
                    } catch (NumberFormatException e) {

                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    zLiczba = -zLiczba;
                    break;
                } else if (stringXDYZ.contains("+")) {
                    parts2 = parts1[1].split("\\+");
                    yLiczba = Integer.parseInt(parts2[0]);
                    try {
                        zLiczba = Integer.parseInt(parts2[1]);
                    } catch (NumberFormatException e) {
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    break;
                } else {
                    parts2 = parts1[1].split("\\+");
                    yLiczba = Integer.parseInt(parts2[0]);
                    try {
                        zLiczba = Integer.parseInt(parts2[1]);

                    } catch (NumberFormatException e) {
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("zle dane wejsciowe");
            }catch (NumberFormatException e) {
                System.out.println("zle dane wejsciowe");
            }

        }

            while (i < xLiczba ){

                if (yLiczba == 3) {
                    r3 = r.nextInt(3) + 1;
                    intxdyz = intxdyz + r3;
                } else if (yLiczba == 4) {
                    r4 = r.nextInt(4) + 1;
                    intxdyz = intxdyz + r4;
                    System.out.println(r4);

                }else if (yLiczba == 6) {
                    r6 = r.nextInt(6) + 1;
                    intxdyz = intxdyz + r6 ;
                    System.out.println(r6);

                }else if (yLiczba == 8) {
                    r8 = r.nextInt(8) + 1;
                    intxdyz = intxdyz + r8;
                }else if (yLiczba == 10) {
                    r10 = r.nextInt(10) + 1;
                    intxdyz = intxdyz + r10;
                }else if (yLiczba == 12) {
                    r12 = r.nextInt(12) + 1;
                    intxdyz = intxdyz + r12;
                }else if (yLiczba == 20) {
                    r20 = r.nextInt(20) + 1;
                    intxdyz = intxdyz + r20;
                }else if (yLiczba == 100) {
                    r100 = r.nextInt(100) + 1;
                    intxdyz = intxdyz + r100;
                }else {
                    System.out.println("Wprowadziles nie poprawne dane");
                }

                    i++;
            }


        intxdyz = intxdyz + zLiczba;



        System.out.println("Liczba wylosowana to: " + intxdyz);


    }
}

//D3, D4, D6, D8, D10, D12, D20, D100.
