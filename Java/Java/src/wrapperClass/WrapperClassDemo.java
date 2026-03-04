package wrapperClass;

public class WrapperClassDemo {

	public static void main(String[] args) {

		//from primitive to object
		int a=10;
		String.valueOf(a);
		System.out.println(a);
		
		double db=1.105;
		System.out.println(String.valueOf(db));
		
		boolean value =false;
		System.out.println(String.valueOf(value));
		
		

		//string too another data types

		String S1="123";
		int it=Integer.parseInt(S1);
		
		String s2="Abhi";
		System.out.println(Boolean.parseBoolean(s2));

	}

}
