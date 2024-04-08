
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructor = special method that is called when an object is instantiated (created)
		Human human = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 18, 100);
		
		System.out.println(human2.age);
		
		human.eat();
		human2.drink();
		
	}

}
