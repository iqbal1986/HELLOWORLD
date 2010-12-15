package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDog{
public static void main(String[] args) {
	Dog d= new Dog();
	try {
		FileOutputStream fs=new FileOutputStream("D:/Javed/Personal/dog.ser");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(d);
		os.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//FileInputStream fis=new FileInputStream("")
}
}
