package demo2;



class Dog{
	String name;

	int age;
	String color;
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1=new Dog();
		
		dog1.age=2;
		dog1.color="Black";
		dog1.name="Tuffy";
		
		System.out.println(dog1.age+"---"+dog1.color+"---"+dog1.name);

	}

}
