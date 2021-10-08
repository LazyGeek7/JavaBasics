package demo3;



class Person{
	
	String name;
	String emailid;
	String mobileNo;
	String NId;
	
	Person(String name, String emailid){
		
		this.name=name;
		this.emailid=emailid;
		
		System.out.println("First constructor");
		
	}
	
	Person(String name,String mobileNo,String emailid){
		this.name=name;
		this.emailid=emailid;
		this.mobileNo=mobileNo;
		System.out.println("2 constructor");
		
	}
	
}

public class AccountCreation {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Swathi","Abc@gmail.com");
		
		Person p2=new Person("Sowmya","1234567892","xyz@gmai.com");

	}

}
