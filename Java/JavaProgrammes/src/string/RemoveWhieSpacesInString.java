package string;

public class RemoveWhieSpacesInString {

	public static void main(String[] args) {
		String St = " string     test ";
		//Aproach-1
		//String st2=St.replace(" ", "");
		//Aproach-2
		String st2 = St.replaceAll("\\s", "");
		System.out.println(st2);

	}

}
