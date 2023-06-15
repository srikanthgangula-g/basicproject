package com;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		/*		---menu driven program---   */
		System.out.println("welcome to calculator");
		System.out.println(".....................");
		/* Accepting input from user */
		Scanner scan = new Scanner(System.in);
		/*upcasting -> Abstraction */
		Calculatorimpl cal = new Calculatorimpl();
		/* infinte loop   */
		while(true) { 
			System.out.println("1:Addition \n2:substractin");
			System.out.println("3:multipication\n34Division");
			System.out.println("5:exit\n Enter you choice");
			int choice = scan.nextInt();
			// Accept choce -> switch statement
			int x=0;
			int y=0;
			if(choice>=1 && choice<=4) {
				System.out.println("enter 1st number");
				x = scan.nextInt(); // 10
				System.out.println("enter 2nd number");
				y = scan.nextInt(); // 20
			}
			switch(choice) {
			case 1: 
				System.out.println("sum of "+x+"&&"+y+" is "+cal.add(x, y));
				break;
			case 2: 
				System.out.println("sum of "+x+"&&"+y+" is "+cal.sub(x, y));
				break;
			case 3: 
				System.out.println("sum of "+x+"&&"+y+" is "+cal.mul(x, y));
				break;
			case 4: 
				System.out.println("sum of "+x+"&&"+y+" is "+cal.div(x, y));
				break;
			case 5: 
				System.out.println("thank you");
				System.exit(0);
				// terminate the program
			default: 
				System.out.println(cal.displayErrormessage());

			}


		}	


	}

} 
