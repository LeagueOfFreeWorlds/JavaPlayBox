package supah;

public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power){
		super(name, age); // in this case, Person is the superclass since Hero extends Person. So whenever we create a new hero, the name and age is immediately passed to the Person class.
		this.power = power;
	}
	public String toString() {
		return super.toString() + this.power;
	}
}
