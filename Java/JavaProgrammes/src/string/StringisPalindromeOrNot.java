package string;

public class StringisPalindromeOrNot {
	public static void main(String[] args)
	{
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=	rev+s.charAt(i);
		
		}
		if (s.equals(rev))
		{
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palidrome");
		}
		
	}
		
	}


