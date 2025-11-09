package pekan6_2511533016;

import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511533016 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        Random random = new Random();

	        int percobaan = 0;
	        String jawab = "ya";

	        while (jawab.equalsIgnoreCase("ya")) {
	            int dadu1 = random.nextInt(6) + 1;
	            int dadu2 = random.nextInt(6) + 1;
	            int total = dadu1 + dadu2;

	            percobaan++;
	            System.out.println(dadu1 + " + " + dadu2 + " = " + total);

	            if (total == 7) {
	                System.out.println("Tebakan Anda Benar");
	                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
	                break;
	            } else {
	                System.out.println("Tebakan Anda Salah");
	                System.out.print("Apakah mau lempar dadu (ya / tidak)? ");
	                jawab = input.next();  
	            }
	        }

	        input.close();
	    } 
	}
