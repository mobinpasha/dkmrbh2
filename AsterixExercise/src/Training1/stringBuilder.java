package Training1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class stringBuilder {

	public static void main(String[] args) {
		String[] Student = {"Alpha", "Gama", "Beta", "Theta", "Uno", "Dos", "Tres", "Ek", "Do", "Teen", "Uno", "Two", "Tres", "Alpha"};
		int i = 0;
		
		 HashSet<String> hSet = new HashSet<String>(Arrays.asList(Student));
		 int hset1 = hSet.size();
			System.out.println(hSet);	
			System.out.println(hset1);
		
			ArrayList<String> Nstring = new ArrayList<String>(Arrays.asList(Student));
			Collections.sort(Nstring);
			System.out.println(Nstring);
			
		for (i=0; i<Student.length;i++) {
			
		
		     System.out.println(Student[i]);
		    
		    
		    
		
				
		}
		//System.out.println();
//		String Student1 = ("AlphaGamaBetaTheta");
//		
//		StringBuilder Comb = new StringBuilder();
//				
//		Comb.append(Student1);
//		
//		Comb = Comb.reverse();
//		System.out.println(Comb);
//	}
}