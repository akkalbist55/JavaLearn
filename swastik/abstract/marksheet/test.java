public abstract class test {
	private int age;
	private String name;

	public test(String name, int age){
		this.age = age;
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}
}
