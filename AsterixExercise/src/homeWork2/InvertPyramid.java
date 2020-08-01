package homeWork2;

public class InvertPyramid {

			 public static void main(String[] args) {
	        int rows = 5, m=0;

	        for(int i = rows; i >= 1; --i) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	            }

	            for(int j=i; j <= 2 * i - 1; ++j) {
	                System.out.print(" " + ++m);
	            }

	            for(int j = 0; j < i - 1; ++j) {
	                System.out.print(" " + ++m );
	            }

	            System.out.println();
	        }
	    }
	}

