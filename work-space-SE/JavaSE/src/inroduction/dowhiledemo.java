package inroduction;

import java.util.Scanner;

public class dowhiledemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		boolean exit1= false;
		do {
			System.out.println("**********************************************\n"
					+"choose from the below options\n"
					+ "1 . personal details\n"
					+ "2 . Admission details\n"
					+ "3 . Fee details\n"
					+ "4 . Student Progress\n"
					+ "5 . More information\n"
					+ "6 . Exit\n "
					+ "**************************\n "
					+ " Enter your choice :");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("In Personal Details Section");
				break;
			case 2:
				System.out.println("In Admission Details Section");
				break;
			case 3:
				System.out.println("In Fee deatails Section");
				break;
			case 4:
				System.out.println("In Student Progress Section");
				break;
			case 5:
				do {
					System.out.println("=========================\n"
							+ "1 .campus contact information\n"
							+ "2 .Faculty directory\n"
							+ "3 .Extra Activities\n"
							+ "4 .Exit\n"
							+ "Enter your option in (More information)");
					int choice1= scan.nextInt();
					switch(choice1) {
					case 1:
						System.out.println("Campus contact Section");
						break;
					case 2:
						System.out.println("Faculty directory section");
						break;
					case 3:
						System.out.println("Extra Activites Section");
						break;
					case 4:
						exit1=true;
						System.out.println("************THANK YOU ****************");
						break;
					default:
						System.out.println("Please enter the valid number");
					}
				}while(!exit1);
				break;
			case 6:
				exit=true;
				System.out.println("************THANK YOU ****************");
				break;
			default:
				System.out.println("Please Enter valid Number from 1-6");
				
			}
			
		}while(!exit);
	}

}
