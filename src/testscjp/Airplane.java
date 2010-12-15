package testscjp;

public class Airplane {
String code="11";
class Blackbox
{
	String code="22";
		public void printvariables()
		{
			System.out.println(code);
			System.out.println(Airplane.this.code);
		}
}
}