package inroduction;

import java.util.Scanner;

public class switchcaseDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Choose your lucky Number from 1-3");
		int number = scan.nextInt();
		switch (number) {
		case 1: {
			System.out.println("your are lucky as ur number is 1");
			break;
		}
		case 2:{
			System.out.println("your good as ur number is 2");
			break;
		}
		case 3:{
			System.out.println("your are introvert as ur number is 3");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}

}
