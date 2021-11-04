package basicWriteOne;
import java.io.*;
public class ReadAFile {
	public static void main(String[] args) {
		
		try {
			File myFile = new File("MyText.txt"); // foile!!!
			FileReader fileReader = new FileReader(myFile); // creating a new reader for the file
			BufferedReader reader = new BufferedReader(fileReader); // Boofer for efficiency
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}