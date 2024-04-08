import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList = a resizable array.
		// 			   Elements can be added and removed after compilation phase
		//             store reference data types (meaning data types like int and double cannot be stored, you must use Integer and Double in these cases
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("ribs");
		food.add("steak");
		food.add("brisket");
		
		food.set(0, "pulled pork");
		food.remove(2);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}