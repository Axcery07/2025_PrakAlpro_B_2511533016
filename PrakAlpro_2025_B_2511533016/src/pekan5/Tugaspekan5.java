package pekan5;

public class TugasPekan5 {

	public static void main(String[] args) {
		 
	        int n = 5;

	        // Bagian atas belah ketupat
	        for (int i = 1; i <= n; i++) {
	            // Spasi
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            // Bintang
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Bagian bawah belah ketupat
	        for (int i = n - 1; i >= 1; i--) {
	            // Spasi
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Bintang
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	     
	    }
	}
