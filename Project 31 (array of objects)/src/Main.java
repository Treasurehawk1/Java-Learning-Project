
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Food[] refrigerator = new Food[3];
		
		Food Food1 = new Food("Pork");
		Food Food2 = new Food("Beef");
		Food Food3 = new Food("Chicken");
		
		Food[] refrigerator = {Food1,Food2,Food3};
		
		//refrigerator[0] = Food1;
		//refrigerator[1] = Food2;
		//refrigerator[2] = Food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}

}
