import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Steps to Deserialize
		//--------------------------------------------------------------
		// 1. Declare your object (don't instantiate)
		// 2. Your class should implement Serializable interface
		// 3. add import java.io.Serializable;
		// 4. FileInputStream fileIn = new FileInputStream(file path);
		// 5. ObjectInputStream in = new ObjectInputStream(fileIn);
		// 6. objectNam = (Class) in.readObject();
		// 7. in.close(); fileIn.close();
		//--------------------------------------------------------------
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\steve\\eclipse-workspace\\Project_75_(Serialization)\\UserInfo.ser");
		
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}

}
