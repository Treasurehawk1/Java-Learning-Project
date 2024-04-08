
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Gabe");
		Friend friend2 = new Friend("Andrew");
		Friend friend3 = new Friend("Alex");
		Friend friend4 = new Friend("Jamo");
		
		Friend.displayFriends();
		
	}

}
