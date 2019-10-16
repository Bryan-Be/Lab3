import java.util.Scanner;

public class AppLab3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter YOUR PERSONAL INFORMATION (name)");
		
		String userName = scan.nextLine();
		
		System.out.println("Please Enter a Numerical Vaule between 1 and 100. Thank You");
		
		int userInput = scan.nextInt();
		
		if (userInput >= 0 && userInput <= 100) {
			System.out.println("Thank you for your input. YOu Did it correctly " + userName);
			if ((userInput % 2) != 0) {
				System.out.println(userInput + " it's Odd just like you " + userName);
			}
			if ((userInput % 2) == 0 && userInput < 25) {
				System.out.println("Even and less then 25!! Woo look at that " + userName);
			}
			if ((userInput % 2) == 0 && userInput >= 26 && userInput <= 60) {
				System.out.println("Even!!!! Can you believe it " + userName);
			}
			if ((userInput % 2) == 0 && userInput > 60) {
				System.out.println(userInput + "Even... Unlike this person named " + userName);
			}
			if ((userInput % 2) != 0 && userInput > 60) {
				System.out.println(userInput + " odd and over 60!! Just like I'm Gonna be hows that make you feel " + userName);
			}

		} else {
			System.out.println("Wrong input value it must be 1-100 please " + userName +" Try again.");
		}

	}

}
