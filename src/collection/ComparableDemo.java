package collection;

import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		List ts1=new ArrayList();
		ts1.add(new Employee("Tom",2000.00));
		ts1.add(new Employee("Sanjay", 40000.00));
		ts1.add(new Employee("Maggie", 1000.00));
		ts1.add(new Employee("Chris", 5000.00));
		Collections.sort(ts1);
		Iterator itr =ts1.iterator();
		while (itr.hasNext())
		{
			Object element=itr.next();
			System.out.println(element +"\n");
		}
	}
}
