import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		
		//2D String array containing password list
		String[][] passwordArray = { { "JavaDuke", "JavaBean", "TheNullPointer" },
				{ "StackOverflow", "VirtualMachine", "LossyPrecision" } };

		//variables to be used below for looping columns, counting, and checking passwords
		int count = 3;
		String password = "";
		String passwordCheck = "";
		int row = passwordArray.length;
		int col = passwordArray[0].length;

		//Scanner takes in user input
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		//Do while to request input
		do {
			System.out.println("Enter your password: ");
			count--; //each time one of 3 counts is used decrement it until the user has no more attempts remaining
			passwordCheck = keyboard.nextLine();
			
			//loop through the rows and columns checking for a match
			for (int j = 0; j < col; j++) {
				for (int i = 0; i < row; i++) {
					password = (passwordArray)[i][j];
					//if a match is found tell the user that they're correct and exit the program
					if (password.equals(passwordCheck)) {
						System.out.println("correct!");
						System.exit(count);
					}
				}
			}
			//If the user is not correct and they have remaining attempts then prompt them to try again
			System.out.println("Invalid log-in. " + (count) + " attempt(s) remaining.");
			}

		while (count > 0 && count < 3 && !passwordCheck.equals(password));

	}

}
