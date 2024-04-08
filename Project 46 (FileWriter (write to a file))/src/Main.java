import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue\n I'm the cutest\n");
			writer.append("(A poem by Phteven)");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
