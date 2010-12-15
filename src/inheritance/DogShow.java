package inheritance;

public class DogShow{

	
	public static void main(String[] args) {
		new DogShow().go();
	}

	private void go() {
		// TODO Auto-generated method stub
	///	new Hound().bark();
		new Hound().sniff();
		new Dog().bark();
		((Dog)new Hound()).bark();
		((Dog)new Hound()).sniff();
		//new Dog().sniff();
	}
}
