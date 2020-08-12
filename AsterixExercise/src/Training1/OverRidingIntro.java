package Training1;

// four Conditions for Method OverRiding
// 1. Same Method
// 2. Same parameters or arguments
//3. different class
//4. Inherit class
//5. This example calls two classes - carcolor & carmodel

public class OverRidingIntro {

	void car() {
		System.out.println("This is my car");
	}
	public void main(String args [] ) {
		OverRidingIntro x = new OverRidingIntro();
		System.out.println(x);
		CarColor c = new CarColor();
		System.out.println(c);
		CarModel m = new CarModel();
		System.out.println(m);
	}
}
