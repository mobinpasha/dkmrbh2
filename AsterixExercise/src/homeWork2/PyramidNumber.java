package homeWork2;

public class PyramidNumber {
	

		    public static void main(String[] args) {
		        int num = 5, k = 0, m = 1, i, j ;

		        for( i = 1; i <= num; ++i, k = 0) {
		            for( j = 1; j <= num - i; ++j) {
		                System.out.print("  ");
		            }

		            while(k != 2 * i - 1) {
		            	
		                System.out.print(m+" ");
		                ++k;
		                ++m;
		            }

		            System.out.println();
		        }
		    }
		}

