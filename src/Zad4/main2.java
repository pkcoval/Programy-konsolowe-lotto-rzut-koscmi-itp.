package Zad4;

import java.util.StringTokenizer;

public class main2 {
    public static void main(String[] args) {

        String text = "Tekst do podziału. przez";
 StringTokenizer sToken = new StringTokenizer(text);
 String s = "";
 String wiekszeNiz3 = "";
 String [] tabWykluczone = {"ponieważ", "oraz", "przez", "wciąż", "jeszcze", "które", "jednak","każdego","Dlaczego","będzie","żeby"};
 while (sToken.hasMoreTokens()) {
     s = sToken.nextToken();
     if(s.length()>3){
         wiekszeNiz3 += " " + s;
     }
 }

String w = wiekszeNiz3.replaceAll(tabWykluczone [2],"");
 System.out.println(w);
        }
    }

