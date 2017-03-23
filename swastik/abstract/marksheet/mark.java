public class mark extends test{

	public mark(String name, int age){
		super(name, age);
	}

	public static void main(String[] args){

		mark obj = new mark(args[0], Integer.parseInt(args[1]));

		System.out.println("Name : " + obj.getName() + "\n Age: " + obj.getAge());
	}
}
