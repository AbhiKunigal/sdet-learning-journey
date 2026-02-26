package methodAndConstructors;

public class MethodMain {

	public static void main(String[] args) {
		Method md=new Method();
		md.method1();
		String name=md.method2();
		System.out.println(name);
		md.method3("Abhi");
		String returnNamne=md.method4("Abhi");
		System.out.println(returnNamne);
		

	}

}
