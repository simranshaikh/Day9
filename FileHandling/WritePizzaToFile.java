package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile {
public static void main(String[] args) {
	//create an object
	Pizza p=new Pizza("Delux Margarita",8);
	
	//2.Write an obj into file FOS ,DOS
	try {
		FileOutputStream fos=new FileOutputStream("pizz.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes(p.toString());
		dos.writeChars(p.toString());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
