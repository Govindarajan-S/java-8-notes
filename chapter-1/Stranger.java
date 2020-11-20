import chapter1.Helper;

public class Stranger {
	Helper helper = new Helper();

	public static void main(String[] args) {
		Stranger stranger = new Stranger();
		stranger.helper.name = "Strange Helper";
		System.out.println(stranger.helper.name);
	}
}