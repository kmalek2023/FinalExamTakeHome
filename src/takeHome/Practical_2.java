package takeHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical_2 {
	
	
	public static void main(String[] args) {
		
		String filePath = "data\\dictiondary.txt";
		
		if(doesFileExist(filePath)) {
			File f = new File (filePath);
			
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = null;
				
				while ((line = br.readLine())!= null ){
					String[] words = line.split("-");
					for (String word: words) {
						String[] subWords = word.split(", ");
						for (String subWord:subWords  ) {
							System.out.println(subWord);
						}
						
					}
					
				}
				
				
			} catch (IOException e) {
				System.out.println("inside");
				e.printStackTrace();
			}
			
		}//else {System.out.println("File does not exists in the path specified, check the path");}

	}
	
	public static boolean doesFileExist(String path) {
		File file = new File(path);
		boolean value = false;
		if (file.exists()) {
			value = true;
		}else {
			value = false;
		System.out.println("file not exists");
		}
		
		return value;
		
	}

}
