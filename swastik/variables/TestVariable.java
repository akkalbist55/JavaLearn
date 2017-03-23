public class TestVariable{
	// instance vatriables
	public String name = "Shyam";

	// local variables
	// static variables (with final keyword)
	private static int age;

	public static final String COLLEGE_NAME = "Swastik College";
	
	public static void main(String[] args) {
		TestVariable varObj = new TestVariable();

		age = 22;
		sp("Name : " + varObj.name);
		sp("\nAge (static private variable) : " + age);

		sp("This is static final value :" + COLLEGE_NAME);
	}

	private static void sp(String str){
		System.out.println(str);
	}
}