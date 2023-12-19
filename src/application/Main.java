package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hours;
		
		System.out.print("What time is it? ");
		hours = input.nextInt();
		
		if (hours > 5 && hours < 12) {
			System.out.println("Good morning");
		} 
		else if (hours >= 12 && hours < 19) {
			System.out.println("Good afternoon");
		}
		else {
			System.out.println("Good night");
		}
		
		input.close();
	}

}
