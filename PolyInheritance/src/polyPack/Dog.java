package polyPack;

public class Dog extends Animal implements Pet{
	private int breed;
	
	public int getBreed() {
		return breed;
	}
	public void setBreed(int breed) {
		this.breed = breed;
	}
	public void eat() {
		System.out.println("Chomp chomp");
	}
	public void beFriendly() {
		System.out.println("*Wags tail*");
	}
	public void play() {
		System.out.println("woof!");
	}
}
