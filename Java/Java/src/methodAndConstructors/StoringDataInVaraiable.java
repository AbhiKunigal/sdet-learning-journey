package methodAndConstructors;

public class StoringDataInVaraiable {
	int population;
	String city;
	void printmethod(){
	System.out.println(population);
	System.out.println(city);
	}
	
	//using method
	void settermethod(int pop,String scity){
		population=pop;
		city=scity;
		
	}

	//using COnstructors
	
	StoringDataInVaraiable(int pop,String scity)
	{
		population=pop;
		city=scity;	
	}
	

}
