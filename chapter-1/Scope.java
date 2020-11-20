public class Scope {

	private int value = 1;
	{ System.out.println(value); }

	public static void main(String[] args) {
		Scope s = new Scope();
		System.out.println(s.value);
	}

}