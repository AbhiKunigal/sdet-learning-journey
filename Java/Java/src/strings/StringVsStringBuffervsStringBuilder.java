package strings;

public class StringVsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		//string--immutable

		String s="Welcome";
		s.concat("to Java");
		System.out.println(s);

		//stringBuffer-mutable

		StringBuffer sb=new StringBuffer("Welcome");
		sb.append("to java");
		System.out.println(sb);

		//StringBuilder-mutable
		StringBuilder SB=new StringBuilder("Welcome");
		SB.append("to java");
		System.out.println(SB);
		
		//original value of the string can be changed in mutable but cannot be changed in immutable
	}

}
