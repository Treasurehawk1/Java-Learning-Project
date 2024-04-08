
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String = a reference data type that can store one or more characters 
		//			reference data types have access to useful methods
		
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("bro"); //returns the true or false if it is equal to the value in the string regardless of case
		int result = name.length(); // returns the length of the string, in this case 3
		char result = name.charAt(0); // returns the character at given location, in this case B
		int result = name.indexOf("o"); // returns the index of the given character, in this case 2
		boolean result = name.isEmpty(); // returns a true or false if the string is empty or not, in this case false
		String result = name.toUpperCase(); // returns the given string into all upper case
		String result = name.toLowerCase(); // returns the given string into all lower case
		String result = name.trim(); // removes any all empty space in a string 
		String result = name.replace('o', 'a'); // replaces the first specified value with the second given value, turning bro into bra in this case
		
	}

}
