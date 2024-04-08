import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// bounded types = you can create the objects of a generic class to have data
		//				   of specific derived types ex.Number
		
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 8);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.1);
		//MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '#');
		//MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '&');
		
		ArrayList<String> myFriends = new ArrayList<>();
		
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		//System.out.println(myChar.getValue());
		//System.out.println(myString.getValue());
	}

}
