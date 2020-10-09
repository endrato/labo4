package parentesiak;

import java.util.*; 
import java.io.*; 

public class ParentesiOrekatuak {

	public static boolean parentesiEgokiak(char[] lerroa) {
		// OSATU METODO HAU
		
	}
	
    public static void main (String args[]) throws FileNotFoundException {
        String fitxIzena = "datuak/fitx.txt";
    	Scanner lerroka = new Scanner(new File(fitxIzena)); 
        char[] lerroa;

        while(lerroka.hasNext()) {
            lerroa = lerroka.nextLine().toCharArray();
            System.out.println("Lerroa: ");
            System.out.println(lerroa);
            System.out.println(parentesiEgokiak(lerroa)? "orekatuta daude" : "ez daude orekatuta");
        }
        lerroka.close();
    }
}