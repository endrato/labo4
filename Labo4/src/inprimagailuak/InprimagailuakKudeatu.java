package inprimagailuak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ilara.Ilara;

public class InprimagailuakKudeatu {

// OSATU KLASE HAU INPRIMAGAILUAK KUDEATZEKO
	
	public static void main(String args[]) throws FileNotFoundException {
		// OSATU PROGRAMA HAU
		
		String fitxIzena = "inprimagailuak/fitx0.txt";
    	Scanner lerroka = new Scanner(new File(fitxIzena)); 
        char[] lerroa;

        
        
        while(lerroka.hasNext()) {
            lerroa = lerroka.nextLine().toCharArray();


            
            
        }


        
        lerroka.close();
	}
}