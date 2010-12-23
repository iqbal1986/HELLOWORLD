package collection;

public class Employee implements Comparable {

	int EmpId;
	String Ename;
	double Sal;
	static int i;
	public Employee()
	{
		EmpId=i++;
		Ename="dont know";
		Sal=0.0;
	}
	public Employee(String ename,double sal)
	{
		EmpId=i++;
		Ename=ename;
		Sal=sal;
	}
	public String toString()
	{
		return "EmpId" + EmpId + "\n" +"Ename" + Ename + "\n" + "Sal" + Sal;
	}
	
	
	public int compareTo(Object O1)
	{
		if(this.Sal==((Employee)O1).Sal)
		return 0;
		else 
		if((this.Sal)>((Employee)O1).Sal)
			return 1;
		else return -1;
		
	}
}
