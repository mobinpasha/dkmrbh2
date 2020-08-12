package Training1;

public class InheritIntro {
int age;
String firstname;
String lastname;

public InheritIntro(int age, String firstname, String lastname) 
{
	 this.age = age;
	 this.firstname = firstname;
	 this.lastname = lastname;
}
	

 void method1() {
	System.out.println("I am in method1");
 }
	public static void main(String[] args) {
		InheritIntro obj1 = new InheritIntro(10, " ABC", " XYZ");

		System.out.println(obj1.age+ " "+ obj1.lastname+ " "+ obj1.firstname);
}
}
