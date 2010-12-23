package collection;
import java.util.*;
public class Testset {

	public static void main(String[] args) {
		String[] things={"phone","mouse","laptop","mouse","chair"};
		List<String> list=Arrays.asList(things);
		System.out.printf("%s",list);
		System.out.println();
		Set<String> set=new HashSet<String>(list);
		System.out.printf("%s",set);
	}
}
