package javaBasics;

public class CricketerDetails {
	static int countryId;
	static String countryName;

	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("welcome to indian cricket team");

		countryId = 91;
		countryName = "India";
		System.out.println(countryId);
		System.out.println(countryName);

		System.out.println("---CricketerInforamtaion-1--");
		
		CricketerDetails virat = new CricketerDetails();
		System.out.println("countryId       :"+countryId);
		System.out.println("countryName     :"+countryName);

		virat.jerseyNo = 18;
		virat.cricketerName = "virat kohli";

		System.out.println("jerseyNo        :" + virat.jerseyNo);
		System.out.println("cricketerName   :" + virat.cricketerName);

		// object creation 2
		System.out.println("---CricketerInforamtaion-2--");
		

		CricketerDetails dhoni = new CricketerDetails();
		System.out.println("countryId       :"+countryId);
		System.out.println("countryName     :"+countryName);

		dhoni.jerseyNo = 7;
		dhoni.cricketerName = "MahendraSingh Dhoni";

		System.out.println("jerseyNo        :" + dhoni.jerseyNo);
		System.out.println("cricketerName   :" + dhoni.cricketerName);
		
		System.out.println("---CricketerInforamtaion-3--");
		
		CricketerDetails rohit = new CricketerDetails();
		System.out.println("countryId       :"+countryId);
		System.out.println("countryName     :"+countryName);

		rohit.jerseyNo = 45;
		rohit.cricketerName = "Rohit Sharma";

		System.out.println("jerseyNo        :"      + rohit.jerseyNo);
		System.out.println("cricketerName   :" + rohit.cricketerName);
		
System.out.println("---CricketerInforamtaion-4--");
		
		CricketerDetails gill = new CricketerDetails();
		System.out.println("countryId       :"+countryId);
		System.out.println("countryName     :"+countryName);

		gill.jerseyNo = 12;
		gill.cricketerName = "Subhaman Gill";

		System.out.println("jerseyNo        :"      + gill.jerseyNo);
		System.out.println("cricketerName   :" + gill.cricketerName);
		
		


	}

}
