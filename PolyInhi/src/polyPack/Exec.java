package polyPack;

public class Exec {
	public static void main(String[] args) {
		Animal[] Animals = new Animal[3];
		 Animals[0] = new Dog();
		 Animals[1] = new Cat();
		 Animals[2] = new octoCat();
		 
		 for(int i = 0; i < Animals.length; i++) {
			 Animals[i].eat();
			 
			 Animals[i].roam();
		 }
	}
}
