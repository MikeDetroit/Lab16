


import java.util.Scanner;

public class CountryApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		String cont = "Y";
		
		while(cont.equalsIgnoreCase("Y")) {
		
			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");
			System.out.println();
			
			String s = Validator.getString(scan, "Enter menu number: ");
			
			if (s.equals("1")) {
				System.out.println();
				FileMethods.readFromFile("Countries/Countries.txt");
				System.out.println();
			} else if (s.equals("2")) {
				System.out.println();
				FileMethods.writeToFile("Countries/Countries.txt", Validator.getString(scan, "Enter Country: "));
				System.out.println("This Country has been saved!");
				System.out.println();
				
			} else if (s.equals("3")) {
				System.out.println();
				System.out.println("Buh-bye!");
				break;
			} else
				System.out.println();
				System.out.println("User input does not match options.  Please try again!");
				System.out.println();	
		}

	}

}
