package homeWork2;

public class Fibonaci
{
	public static void main(String args[]) 
	
	{ 
		int i, num1=0, num2=1, num3, j=50;
			System.out.print(num1+" "+num2);
			
			for(i=2; i<j; i++)
				{
					num3=num1+num2;
					System.out.print(" "+num3);
					num1 = num2;
					num2 = num3;
					
				}
		
	}
}
