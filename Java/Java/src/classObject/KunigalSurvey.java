package classObject;

public class KunigalSurvey {
	int TotalPopulationcount=2000;
	String AreaName;
	int areapopulationcount;
	int pincode;

	void survey()
	{
		System.out.println(TotalPopulationcount);
		System.out.println(AreaName);
		System.out.println(areapopulationcount);
		System.out.println(pincode);
	}
	
	
	//Approah-1 main method inside a class itself

	/*public static void main(String[] args) {
		
		KunigalSurvey s1=new KunigalSurvey();
		s1.AreaName="udayranga";
		s1.areapopulationcount=200;
		s1.pincode=572130;
		s1.survey();

	}*/
	
	//Approach-2 main method in different class-(surveyMain)-implemented in surveymain

}
