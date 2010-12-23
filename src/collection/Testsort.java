package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Testsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stuff=new ArrayList<String>();
		stuff.add("Denver");
		stuff.add("Boluder");
		stuff.add("Vail");
		stuff.add("Aspen");
		System.out.println("unsorted"+stuff);
		Collections.sort(stuff);
		System.out.println("sorted"+stuff);
		
	}

}
