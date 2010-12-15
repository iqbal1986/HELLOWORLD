package fileio;
import java.io.*;
public class Writer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean newfile=false;
		File file=new File("D:/Javed_OldData/Javed_Iqbal/Java_study_material/newfile1.txt");
		System.out.println(file.exists());
		try {
			newfile=file.createNewFile();
			System.out.println(newfile);
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
