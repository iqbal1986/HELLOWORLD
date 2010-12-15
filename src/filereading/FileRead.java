package filereading;
import java.io.*;
public class FileRead {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fs=new FileInputStream("C:/Documents and Settings/javediqubal.mohammad/My Documents/My Received Files/today_query.txt");
			DataInputStream in=new DataInputStream(fs);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strline;
			while((strline=br.readLine())!=null)
			{
				System.out.println(strline);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
