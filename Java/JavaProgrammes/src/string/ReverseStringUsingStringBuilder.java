package string;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String st = "Welcome";
		StringBuilder st1 = new StringBuilder(st);
		System.out.println(st1.reverse());
	}
}
