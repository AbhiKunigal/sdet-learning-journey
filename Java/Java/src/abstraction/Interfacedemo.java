package abstraction;

interface shape {
	int length = 10; // static and final key is there even though it is not specfied
	int height = 20;// static and final key is there even though it is not specfied

	void circle();

	default void square() // need to specify the default/static keyword if we want to implement the method
							// in interface clase
	{
		System.out.println("This is square");
	}

	static void rectangle() // need to specify the default/static keyword if we want to implement the method
							// in interface clase
	{
		System.out.println("This is Rectangle");
	}
}

public class Interfacedemo implements shape {
	public void circle() {
		System.out.println("this is circle");
	}

	void triangle() {
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {

		// scenario-1 (reference varible and object name is class)
		Interfacedemo x = new Interfacedemo();
		x.circle();// abstract
		x.square();// default
		shape.rectangle();// static method can be access directly using interface class
		x.triangle();

		// scenario-2(reference variable is interface and object is of class)
		shape y = new Interfacedemo();
		y.circle();
		y.square();
		shape.rectangle();
		//y.triangle(); ---> we cannot access this as it created in Interfacedemo class and we have reference of interface class y
		
	}

}
