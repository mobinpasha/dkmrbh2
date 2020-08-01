package revision;

import java.util.ArrayList;

public class ArraylistIntro {
 
	public static void main(String args []) {
		
		ArrayList <String> lista = new ArrayList <String>();
		lista.add("hero");
		lista.add("mike"); 
		lista.add("tom");
		lista.add(0, "mom");
		lista.remove(2);
		System.out.println(lista);
	}
}
