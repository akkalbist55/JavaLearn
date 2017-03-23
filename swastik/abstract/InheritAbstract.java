public class InheritAbstract extends TestAbstract{

	public InheritAbstract(String name, int age){
		super(name, age);
	}

	public static void main(String[] args){

		InheritAbstract obj = new InheritAbstract(args[0], Integer.parseInt(args[1]));

		System.out.println("Name : " + obj.getName() + "\n Age: " + obj.getAge());
	}
}