package inroduction;

import java.util.Scanner;

public class whiledemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number please : ");
		int num = scan.nextInt();
		while(num >=0) {
			System.out.println("number is  = "+num);
			num--;
		}
	}

}
