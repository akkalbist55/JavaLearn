public class TestString{
	public static void main(String[] args) {

		String greeting = "Hello ";
		sp(greeting);

		int len = greeting.length();

  	sp( "String Length is : " + len );

  	sp( greeting.concat("World !") );

  	System.out.printf("This is for float 	:  %f \n" +
			"This is for integer			: %d \n" +
          	"And this for string 			: %s \n", 
              3030.00, 22, "Test string");

  	sp("\n----------------------------------------------\n");

  	// or
  	String formattedString;
  	formattedString = String.format("Name : %s %s\nAge : %d"+
      "\nSalary : %f\n", "Ram", "Sharma", 22, 1200.33);
  	sp(formattedString);

  	// search string
  	//String searchingString = "Some paragraph goes here very long.";
  	//sp(searchingString.indexOf(new String("new")));

	}

	private static void sp(String str){
		System.out.println(str);
	}
}