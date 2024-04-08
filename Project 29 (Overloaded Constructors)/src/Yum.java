
public class Yum {
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Yum(){
	
	}

	Yum(String bread){
		this.bread = bread;
	}
	
	Yum(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Yum(String bread, String sauce, String cheese){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	
	}
	
	Yum(String bread, String sauce, String cheese, String topping){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
