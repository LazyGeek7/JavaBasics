package demo2;


class Student{
	int id;
	String name;
	
	public void insertRecord(int id1,String name1) {
		
		id=id1;
		name=name1;
		
	}
	
}



public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Student s2=new Student();
		s1.insertRecord(1, "Tom");
		s2.insertRecord(2, "Peter");
		
		System.out.println(s1.id+"----------"+s1.name);
		System.out.println(s2.id+"----------"+s2.name);
		
	
		

	}

}
