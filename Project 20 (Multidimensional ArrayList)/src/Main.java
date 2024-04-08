import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pasteryList = new ArrayList();
		ArrayList<ArrayList<String>> groceries = new ArrayList();
		
		pasteryList.add("bagel");
		pasteryList.add("pound cake");
		pasteryList.add("cake");
		
		ArrayList<String> fruitList = new ArrayList();
		
		fruitList.add("apple");
		fruitList.add("orange");
		fruitList.add("banana");
		
		ArrayList<String> spiceList = new ArrayList();
		
		spiceList.add("thyme");
		spiceList.add("pepper");
		spiceList.add("cilantro");
		
		groceries.add(pasteryList);
		groceries.add(fruitList);
		groceries.add(spiceList);
		
		System.out.println(groceries.get(2).get(1));
		
	}

}
