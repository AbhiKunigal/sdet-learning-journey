package thisStaticKeywords;

public class StaticKeyword {
	String Name;//non static variable
	static int dept = 10;//static variable

	static void m1()// static method
	{
		System.out.println("This the static method");
	}

	void m2()//non static method
	{
		System.out.println("this non static method");
		
	}

	// 1. Static methods can access static variables/methods directly (no object
	// required).
	/*public static void main(String[] args) {
		System.out.println(dept);
		m1();

	}*/		
	
	// 2. Static methods cannot directly access non-static (instance)
	/*public static void main(String[] args) {
		
		System.out.println(Name);
		m2();
		//---->results in error;we need to create a object
		///// variables/methods — to do so they must use an object reference.

	}*/
	
	
		// 3. Non-static methods (instance methods) can access both static and
		// non-static members directly.
	
	void m3(String Name)//non static method
	{
		this.Name =Name;
		System.out.println(Name);
		System.out.println(dept);
		m1();
		m2();
		
	}
	
	public static void main(String[] args)
	{
		StaticKeyword st =new StaticKeyword();
		st.m3("Mechanical");
	}
	
		// 4. From another class, access a static member with `ClassName.member` (no
		// instance needed).

}
