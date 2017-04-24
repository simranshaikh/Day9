package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {

		File f=new File("data.txt");
	System.out.println(	f.getAbsolutePath());
		if(f.exists())
			System.out.println("File exists");
		else
			try {
				if(f.createNewFile())
					System.out.println("File created");
				else
					System.out.println("File IsNot Created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
