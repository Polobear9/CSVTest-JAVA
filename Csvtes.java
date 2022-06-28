package CSVtest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Csvtes {
	public static void main(String[] args) {
		
		String fileName = "BD.csv";
				
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.print("File is not ture");
			return;
		}
		
		try (FileReader fileReader = new FileReader(fileName); 
				 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					String[] arrayStr = line.split(",");

					for (String str : arrayStr) {
						System.out.println(str);
					}
				}
			} catch (IOException e) {
				System.out.println(e);
			}
				
				
	}

}
