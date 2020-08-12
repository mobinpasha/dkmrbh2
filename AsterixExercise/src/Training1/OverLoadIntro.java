package Training1;

//Three Conditions for Method OverRiding
//1. Same Method
//2. Different  parameters or arguments
//3. Same  class

public class OverLoadIntro {

	public void food() {
		System.out.println("This food is great");
	}
	
	void tuna() {
		System.out.println("Tuna sandwiches are great");
	}
	void tuna(int a) {
		System.out.println("$"+a+" Tuna sandwich with fish sauce are good");
	}
	void tuna(int a, String b) {
		System.out.println("$"+a+" "+b+" Tuna sandwich with fish sauce are good");
	}
	public static void main(String[] args) {
		OverLoadIntro n = new OverLoadIntro();
		n.tuna(10, "Cheese");
		n.tuna(5);
		n.tuna();
		//System.out.println(n);
	}
}
