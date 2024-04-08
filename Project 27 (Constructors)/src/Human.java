
public class Human {

	String name;
	int age;
	double weight;
	
	
	Human(String name, int age, int weight){
		// this keyword is used to specify the current object being specified where it is called
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating!");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking!");
	}
}
