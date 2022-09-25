package healthyheart;

import java.util.Scanner;

public class HealthyHeart {

	public static void main(String[] args) {
		int age;
		Scanner myScanner = new Scanner(System.in);
		
			System.out.println("What is your age?");
			age = myScanner.nextInt();
			
			System.out.println("Your maximum heart rate should be " + (220 - age));
			System.out.println("Your target HR Zone is " + 0.5*(220- age) + " - " + 0.85*(220-age) + " beats per minute");
	}

}
