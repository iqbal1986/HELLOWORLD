package collection;

import java.util.Comparator;

public class NameComparator implements Comparator {

	
	public int compare(Object stud1, Object stud2) {
		// TODO Auto-generated method stub
		String stud1name=((Student)stud1).getname();
		String stud2name=((Student)stud2).getname();
		return stud1name.compareTo(stud2name);
	
	}

}
