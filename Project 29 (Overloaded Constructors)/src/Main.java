
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// overloaded constructors = multiple constructors within a class with the same name,
		//							 but have different parameters
		//							 name + parameters = signature
		
		Yum yummy = new Yum("Thin crust", "tomato", "Mozzarella", "pepperoni");
		
		System.out.println("Here are the ingredients of your yum ");
		System.out.println(yummy.bread);
		System.out.println(yummy.sauce);
		System.out.println(yummy.cheese);
		System.out.println(yummy.topping);
		
		

	}

}
