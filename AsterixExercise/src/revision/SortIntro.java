
package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortIntro {

	public static void main(String args []) 
	{
		
		//String [] listb = {"Hero", "Tom", "Harry", "Richard", "Adam"};

	ArrayList <String> listb = new ArrayList <String>();
	
	//String [] listb = {"Hero", "Tom", "Harry", "Richard", "Adam"};
	listb.add("Hero");
	listb.add("Tom");
	listb.add("Harry");
	listb.add("Richard");
	listb.add("Onur");
	listb.add(2,"Adam");
	listb.remove("Onur");
	Collections.sort(listb);
	//System.out.println(listb);
	
	//for loop
//	for(int i=0; i<listb.size(); i++)
//		{
//	System.out.print(listb.get(i)+" ");
//	
//	//while loop
//	
//	int i = 0;
//			while(listb.size() > i)
//			{
//			System.out.print(listb.get(i)+" ");	
//			i++;
	
	Iterator it1 = listb.iterator();
	while(it1.hasNext())
	{
		System.out.print(it1.next()+" ");
		
	
	}
	}
	}
//}
	

