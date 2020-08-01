package revision;

public class NestedConditions {
static int age = 20;
static int weight = 25;

public static void main(String [] args) {

	if (age <= 20)
	{
		if (weight  < 40) 
		
		System.out.println("ineligible");

	}
	else
	System.out.println("eligible");
}
}




