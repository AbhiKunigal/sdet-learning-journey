package methodAndConstructors;

public class Method {

//### 1. No Parameters, No Return Value
	void method1() {
		System.out.println("Hello");
	}

	// ### 2. No Parameters, Return Value
	String method2() {
		return "Hello method2";
	}

	// ### 3. Parameters, No Return Value
	void method3(String Name) {
		System.out.println("My name-" + Name);
	}

	// ### 4. Parameters, Return Value
	String method4(String Name) {
		return ("My name-" + Name);
	}

}
