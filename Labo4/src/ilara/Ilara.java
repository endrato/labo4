package ilara;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Ilara {
	private Nodo bukaerakoa; // zerrendako azken nodoaren erreferentzia
	private Nodo hasierakoa; // zerrendako lehenengo nodoaren erreferentzia

	private class Nodo {
		int datua;
		Nodo hurrengoa;

		public Nodo(int datua) {
			this.datua = datua;
			this.hurrengoa = null;
		}
	}


	
	public Ilara() { // eraikitzailea
		// KODE HAU OSATU
		this.hasierakoa=null;
		this.bukaerakoa=null;
		
		
	}

	public boolean add(int arg0) 
			throws IllegalStateException, ClassCastException, NullPointerException, IllegalArgumentException {
		// KODE HAU OSATU
		Nodo azkena = new Nodo(arg0);
		
		if(this.hasierakoa != null) {
		this.bukaerakoa.hurrengoa= azkena;
		this.bukaerakoa=azkena;
		}else
			this.hasierakoa=azkena;
		    this.bukaerakoa=azkena;
		return true;    
	}
	

	public int element() throws NoSuchElementException {
		// KODE HAU OSATU
	    if(this.hasierakoa == null) {
	    	return (size());
	    }else
	    	return hasierakoa.datua;
		}
		
	

	//public boolean offer(int arg0) throws ClassCastException, NullPointerException, IllegalArgumentException {
		// KODE HAU OSATU
		
		
	//}

	//public int peek() {
		// KODE HAU OSATU
		//}

	public int poll() {
		// KODE HAU OSATU
		int lehen;
		if(this.hasierakoa!=null) {
			lehen=this.hasierakoa.datua;
			this.hasierakoa=this.hasierakoa.hurrengoa;
		}else {
			lehen=1;
		}
		return lehen;
		
					
		}
		
	

	//public int remove() throws NoSuchElementException {
		// KODE HAU OSATU
		
		

	//}

	public boolean isEmpty() {
		// KODE HAU OSATU
		if(this.hasierakoa==null) {
			return true;
		}else
			return false;
		}
		

	

	public int size() {
		// KODE HAU OSATU
		int kop=0;
		
		while(this.hasierakoa != null) {
			kop = kop +1; 
			this.hasierakoa = this.hasierakoa.hurrengoa;
		}
		return kop;
		}		
			
	

	public void inprimatu( ) {
		// KODE HAU OSATU
		// BEHAR BADUZU
		
		
	}
	
	public Iterator<Integer> iterator() {
		// KODE HAU OSATU
		
		

	}
	
}