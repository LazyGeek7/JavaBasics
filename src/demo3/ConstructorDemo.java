package demo3;

public  class ConstructorDemo {
	int s=9;
	
      ConstructorDemo(){
		super();
		
		System.out.println("Hello Constructor"+this.s);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo();

	}

}
