package collection;
import java.util.*; 
public class JavaComapratorExample {

	public static void main(String[] args) {
		Student student[]=new Student[2];
		student[0]=new Student();
		student[0].setage(23);
		student[0].setname("Joe");
		student[1]=new Student();
		student[1].setage(20);
		student[1].setname("Mark");
		
		System.out.println("Order of student before sorting is");
		for (int i=0; i<student.length;i++)
		{
			System.out.println("Student" + (i+1)+ "name::" + student[i].getname()+",Age::"+ student[i].getage());
		}
		Arrays.sort(student,new AgeComparator());
		System.out.println("\n\n Order of student after sorting by student age is  ");
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Student"+ (i+1)+"name::" +student[i].getname()+", Age::"+ student[i].getage());
		}
		
		Arrays.sort(student,new NameComparator());
		System.out.println("\n\n Order of student after sorting by student name is");
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Student"+ (i+1)+"name::" +student[i].getname()+", Age::"+ student[i].getage());
		}
	}
}
