package opertors;

public class Operators {

	public static void main(String[] args) {
	
	/* 1) Arithmetic Operators
	Used to perform mathematical operations.

	`+`  Addition  
	`-`  Subtraction  
	`*`  Multiplication  
	`/`  Division  
	`%`  Modulus (Remainder)*/
		
		int a=10,b=5;
		
		String Name1="Abhi";
		String Name2 = "Kavya";
		String Name3 ="Abhi";
		
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		/*## 2) Relational / Comparison Operators
		Used to compare two values.

		`>`   Greater than  
		`<`   Less than  
		`>=`  Greater than or equal to  
		`<=`  Less than or equal to  
		`!=`  Not equal to  
		`==`  Equal to  */
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		System.out.println("compare two result"+":"+(Name1==Name2));
		System.out.println("compare two result"+":"+(Name1==Name3));
		
		/*## 3) Logical Operators
		Used to combine conditional statements.

		`&&`  Logical AND  
		`||`  Logical OR 
		'!'*/
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		/*## 4) Increment & Decrement Operators
		Used to increase or decrease value by 1.

		`++`  Increment  
		`--`  Decrement */
		
		int c=10;
		System.out.println(c++);
		System.out.println(c--);
		
		/*## 5) Assignment Operators/shorthand opeators
		Used to assign values.

		`=`   Assign  
		`+=`  Add and assign  
		`-=`  Subtract and assign  
		`*=`  Multiply and assign  
		`/=`  Divide and assign  
		`%=`  Modulus and assign  */
		
		int d=10;
		d+=5;	
		System.out.println("Add and assign"+" "+d);
		d-=5;
		System.out.println("Subtract and assign"+" "+d);
		d*=2;
		System.out.println("Multiply and assign" + " "+d);
		d/=2;
		System.out.println("Divide and assign" +" "+d);
		d%=2;
		System.out.println("Modulus and assign" +" "+d);
		
		/*## 6) Conditional (Ternary) Operator
		Used as shorthand for if-else.

		`?:*/
		
		int L=200,M=100;
		int z= (L>M)?L:M;
		System.out.println(z);

		int g= (L<M)?L:M;
		System.out.println(g);
		
		int Abhi_Age=15;
		String res = (Abhi_Age>=18)?"Elligible":"Not elligible";
		System.out.println(res);
	}

}
