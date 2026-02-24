package string;

public class RemoveJunkorSpecialCharsInstring {

	public static void main(String[] args) {

String s="gmail@%23";
String a=s.replaceAll("[^a-zA-z0-9]", "");
System.out.println(a);
	}

}
