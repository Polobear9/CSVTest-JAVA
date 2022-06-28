package CSVtest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Csvtes {
	public static void main(String[] args) {
		
		String fileName = "BD.csv";
				
		File CSVfile = new File(fileName);
		
		if(!CSVfile.exists()) {
			System.out.print("File is not ture");
			return;
		}
		
		try (FileReader fileReader = new FileReader(fileName); 
				 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					
					System.out.println(line);
					
				}
				
				bufferedReader.close();
				
			} catch (IOException e) {
				System.out.println(e);
			}
				
				
	}

}
