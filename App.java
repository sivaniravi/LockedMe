package frontEnd;

import java.util.*;
import ascending.Ascending;
import operations.Operations;

public class App {
    static Scanner sn = new Scanner(System.in);

	public static void info() {

		String appHeader = String.format("****************************************************\n"
				+ "************* Welcome to LockedMe.com  *************\n"
				+ "****************************************************\n");

        String developerName = "Dev - Sivani.R \n";

		String developerEmail = "DevEmail - sivanipriya05@gmail.com\n";

		String appDetails = "You can use this application to :-\n" + "--> Retrieve all file names in a given folder\n"
				+ "--> Add, delete or search files\n";

		System.out.println(appHeader);

	    System.out.println(developerName);

		System.out.println(developerEmail);

		System.out.println(appDetails);

	}
	public static void main() {
		System.out.println("");
		System.out.println("Main Menu");
		System.out.println("Press 1 to show file in Ascending Order");
		System.out.println("Press 2 to view file operations");
		System.out.println("Press 3 to Exit from the application");

		int choice = sn.nextInt();
		handle(choice);
	}
	public static void handle(int num) {
		switch(num) {
			case 1:
				Ascending.ascendingOrder();
				break;
			case 2:
				Operations.FileOperations();
				break;
			case 3:
				System.out.println("Terminated :( ");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
		}
		main();
	}
	public static void main(String[] args) {
		info();
		main();

	}
}

