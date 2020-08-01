package homeWork2;

public class Overload1 {

	public static int sum(int a, int b) {
		return a+b;
	}
	

	public static int sum(int a, int b, int c) {
		return a+b+c;
}
	public static String m(String name) {
		return name;
}
	public static String m(String name, String sex) {
		return (name, sex); 
		//return sex;
		
}
	public static void main(String args []) {
	
		System.out.println(sum(4,5,9));
		System.out.println(m("Hero"+ " "+"Male"));
	//	System.out.println(string m);
}
}