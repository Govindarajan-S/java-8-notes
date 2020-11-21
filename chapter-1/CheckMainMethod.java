class CheckMainMethod1 {
	
	private long value = 2;

	private double dValue = 14.0f;

	public void main(String[] args) {
		System.out.println(value);
		System.out.println(dValue);
	}

}

public class CheckMainMethod {
	public static void main(String[] args) {
		CheckMainMethod1 checkMainMethod = 
						new CheckMainMethod1();
		checkMainMethod.main(args);
	}
}