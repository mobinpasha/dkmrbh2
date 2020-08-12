package Training1;

public class ForLoopPract2 {

	public static void main(String args[]) {
		
		int[] j = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < j.length; i++) {
		System.out.println(i);
		System.out.println("This is "+ j[i]);
		}
		
		for(int i :j) {
			System.out.println(i);
		}
	}
}
