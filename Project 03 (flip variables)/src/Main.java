
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "kool aid";
		String temp;
		
		System.out.println("x before switch :"+ x);
		System.out.println("y before switch :"+ y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("x after switch :"+ x);
		System.out.println("y after switch :"+ y);

	}

}
