package FileHandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("source.txt");
			FileOutputStream fos=new FileOutputStream("dest.txt");
			
			int ch;
			while((ch=fis.read())!=-1)
			{
			
					fos.write(ch);
				} 
			fis.close();
			fos.close();
			
		}
catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
	}
}
