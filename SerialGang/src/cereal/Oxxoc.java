package cereal;
import java.io.*;
public class Oxxoc implements Serializable {
	private int width;
	private int height; 
	public void setWidth(int w) {
		width = w; 
	}
	public void setHeight(int h) {
		height = h; 
	}
	
	public static void main(String[] args) {
		Oxxoc ox = new Oxxoc();
		ox.setHeight(20);
		ox.setWidth(40);
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(ox);
			os.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
