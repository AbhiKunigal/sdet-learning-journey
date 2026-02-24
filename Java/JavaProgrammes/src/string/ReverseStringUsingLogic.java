package string;

public class ReverseStringUsingLogic {

	public static void main(String[] args) {
	/*	//Aproach-1
		String st1 = "Test";
		String temp = "";

		for (int i = st1.length() - 1; i >= 0; i--) {
			temp = temp + st1.charAt(i);

		}
		System.out.println(temp);*/
		
		
		//Aproach-2-without using string methods/using chararray
		String st="Welcome";
		String temp="";
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			temp= temp+ch[i];
			
		}
		System.out.println(temp);
	}

}
