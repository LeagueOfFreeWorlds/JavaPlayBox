package polyPack;

public class Cat extends Animal{
	private String litterPreference;

public String getLitterPreference() {
	return litterPreference;
}
public void setLitterPreference(String litterPreference) {
	this.litterPreference = litterPreference;
	}
public void eat() {
	System.out.println("cronch cronch");
	}
}
