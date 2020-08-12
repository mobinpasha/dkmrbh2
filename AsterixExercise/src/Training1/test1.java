package Training1;

import java.util.Locale;

public class test1 {
     //class variable (with static keyword-can be used globally)
	
	static int i = 10;
	
	public void car() {
	//instance variable 
	int a = 5;
	car obj1 = new car();
	 
	System.out.println(a);
	}
	public  void localvar() {
		//local variable	
		String abc = "title";
		System.out.println("This is local variable "+ abc);
	}	
	public static void main(String[] args) {
        
      
         
         
		System.out.println("This is a class variable" + a);
		//block variable
		for (i=10; i>0; i++)
		System.out.println(i);
	}		
}
}