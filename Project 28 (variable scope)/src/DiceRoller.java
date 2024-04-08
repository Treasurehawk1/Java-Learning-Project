import java.util.Random;

public class DiceRoller {

	
	DiceRoller(){
		Random random = new Random();
		roll(random);
	}
	
	void roll(Random random) {
		int number = random.nextInt(6) + 1;
		System.out.println(number);
	}
	
}
