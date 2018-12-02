import org.omg.CORBA.Object;

import java.util.Date;
import java.util.StringTokenizer;

public class Lab_3_2 {
    public static void main(String[] args) {
       StringTokenizer st;

       String data = "28/07/1990";

        st = new StringTokenizer(data, "/");
        System.out.println("Zadanie pierwsze:");
        System.out.println("Data start: " + data);
        System.out.println("");
        System.out.println("Dzien: " + st.nextToken());
        System.out.println("Miesiac: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());


///////////
        System.out.println("");
        System.out.println("Zadanie drugie:");
        ZmienneEgzamplarza wartosc1 = new ZmienneEgzamplarza();
        wartosc1.weight = 5;
        wartosc1.depth = 6;
        wartosc1.height = 7;

        show(wartosc1);


    }



        static void show (ZmienneEgzamplarza wartosc){
            System.out.println(" ");
            System.out.println("Weight: " + wartosc.weight); // wypisze wszystkko w jednej linii
            System.out.println("Depth: " + wartosc.depth); // wypisze wszystkko w jednej linii
            System.out.println("Height: " + wartosc.height); // wypisze wszystkko w jednej linii

        }



}

class ZmienneEgzamplarza {
         int height, weight, depth;

}


class LiczenieInstancji{
    ZmienneEgzamplarza zmienna1 = new ZmienneEgzamplarza();
    ZmienneEgzamplarza zmienna2 = new ZmienneEgzamplarza();
    ZmienneEgzamplarza zmienna3 = new ZmienneEgzamplarza();

}
