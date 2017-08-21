
public class Person {
	
	String name;
	float age;
	String gender;
	static String genus = "h";
	
	public Person(String argument, float age, String gender){
		this.name = argument;
		this.age = age;
		this.gender = gender;
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String myName = "Mark";
		float favoriteNumber = 1000000;
		System.out.println(myName + "'s favorite number is " + favoriteNumber);
		
		Person carl = new Person("Carl", 35, "M");
		Person mark = new Person("Mark", 34, "M");

		carl.printPerson();
		mark.printPerson();
		
		mark.printMessage("work harder");
	}

	public void printMessage(String message){
		System.out.println(message);
	}
	public void printPerson(){
		System.out.println(this.name + ", " + this.age + ", " + this.gender);
	}
}

