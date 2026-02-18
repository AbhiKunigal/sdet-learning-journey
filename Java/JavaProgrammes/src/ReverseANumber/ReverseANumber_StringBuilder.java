package ReverseANumber;

import java.util.Scanner;

public class ReverseANumber_StringBuilder {

	public static void main(String[] args) {
Scanner nb = new Scanner(System.in);
System.out.println("Enter nmber'");
int numb=nb.nextInt();
StringBuilder st =new StringBuilder();
st.append(numb);
StringBuilder rev=st.reverse();
System.out.println(rev);
	}

}
