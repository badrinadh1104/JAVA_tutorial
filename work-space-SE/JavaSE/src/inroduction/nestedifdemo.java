package inroduction;

public class nestedifdemo {

	public static void main(String[] args) {
		// nested if condition 
		boolean payment = false;
		boolean booked = true;
		if(payment) {
			if(booked) {
				if(payment) {
					System.out.println("Your booking is done and Payment is confirmed");
				}else {
					System.out.println("Your Booking is on hold ,Please make payment soon");
				}
			}else {
				System.out.println("Your Booking Failed");
			}
		}else {
			System.out.println("Please make the payment for the process");
		}
		

	}

}
