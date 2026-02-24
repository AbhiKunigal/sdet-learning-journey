package string;

public class CountOccurenceOfCharInString {

	public static void main(String[] args) {
		String st="Ridhika";
		int countbefore=st.length();
		String st1=st.replace("i", "");
		int contAfter=st1.length();
		System.out.println("count of char i:"+(countbefore-contAfter));
		

	}

}
