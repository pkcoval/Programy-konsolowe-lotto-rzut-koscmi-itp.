package Zad5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) {

        String strona1 = "";
        String s = "";
        String wiekszeNiz3 = "";
        String arrayWithoutWords ="";


        Connection connect1 = Jsoup.connect("http://www.gazeta.pl/0,0.html");
        Connection connect2 = Jsoup.connect("https://www.onet.pl/");
        try {
            Document document = connect1.get();
            Elements links1 = document.select("span.title");
            Document document2 = connect2.get();
            Elements links2 = document2.select("span.title");
            for (Element elem : links1) {
                strona1 += elem.text();
            }
            for (Element elem : links2) {
                strona1 += elem.text();
            }
//            System.out.println(strona1);

            FileWriter plik = new FileWriter("popular_words.txt", false); //SAVE FILE
            plik.append(strona1);
            plik.close();

            File file = new File("popular_words.txt");
            Scanner konsola = new Scanner(file);
            StringBuilder reading = new StringBuilder();
            while (konsola.hasNextLine()) { // LOAD FILE
                reading.append(konsola.nextLine());
            }

            s = reading.toString();

            StringTokenizer sToken = new StringTokenizer(strona1);//DELATING WORLDS
            String [] tabWykluczone = {"ponieważ", "oraz", "przez", "wciąż", "jeszcze", "które", "jednak","każdego","Dlaczego","będzie","żeby"};
             while (sToken.hasMoreTokens()) {
                 s = sToken.nextToken();
                 if (s.length() > 3) {
                     wiekszeNiz3 += " " + s;
                 }
             }

             for(int i =1; i<tabWykluczone.length; i++){
                 arrayWithoutWords += wiekszeNiz3.replaceAll(tabWykluczone[i],"");
             }

//            System.out.println(arrayWithoutWords);

            FileWriter plik2 = new FileWriter("filtered_popular_words.txt");//SAVE FILE
             plik2.append(arrayWithoutWords);
             plik2.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
