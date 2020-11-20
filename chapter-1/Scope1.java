public class Scope1 {

	private static int value = 1;
	{ System.out.println(value); }

	public static void main(String[] args) {
		System.out.println(value);
	}
	
}