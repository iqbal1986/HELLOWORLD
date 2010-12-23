package collection;

import java.util.Comparator;

public class AgeComparator implements Comparator{


	public int compare(Object stud1, Object stud2) {
		// TODO Auto-generated method stub
		int stud1age=((Student)stud1).getage();
		int stud2age=((Student)stud2).getage();
		if(stud1age>stud2age)
			return 1;
		else if(stud1age<stud2age)
			return -1;
		else
		return 0;
	}

}
