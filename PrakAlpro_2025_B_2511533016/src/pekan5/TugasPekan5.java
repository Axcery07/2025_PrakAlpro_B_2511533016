package pekan5;

public class tugasPerulanganFor {

	public static void main(String[] args) {
		int n = 5; // tinggi setengah belah ketupat

        // baris atas bingkai
        System.out.print("#");
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("-");
        }
        System.out.println("#");

        // bagian atas belah ketupat
        for (int i = 1; i <= n; i++) {
            System.out.print("|");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("<");
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(".");
            }
            if (i > 1) {
                System.out.print(">");
            } else {
                System.out.print(">");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // bagian bawah belah ketupat
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("|");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("<");
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(".");
            }
            if (i > 1) {
                System.out.print(">");
            } else {
                System.out.print(">");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // baris bawah bingkai
        System.out.print("#");
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("-");
        }
        System.out.println("#");
    }

	}

