package methodAndConstructors;

public class StoringDataInVaraiableMain {

	public static void main(String[] args) {
		//Approach-1 Through object reference
		/*StoringDataInVaraiable mc=new StoringDataInVaraiable();
		mc.population=1000;
		mc.city="kunigal";
		mc.printmethod();
		
		//Approach-2 Using a Method
		StoringDataInVaraiable mc1=new StoringDataInVaraiable();
		mc1.settermethod(200, "Bagenahalli");
		mc1.printmethod();
		
		*/
		
		//Approach-3 using constructors
		
		StoringDataInVaraiable mc1=new StoringDataInVaraiable(150,"Kunigal");
		mc1.printmethod();

	}

}
