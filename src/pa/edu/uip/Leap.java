package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap{

    public static void main(String[] args) throws IOException{
        int year;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un año:  ");
        year = Integer.parseInt(br.readLine());

        if ((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 !=0))) {

            System.out.println("El año " + year + " es un año bisiesto");
        } else {
            System.out.println("El año " + year + " no es un año bisiesto");
        }

    }
}
