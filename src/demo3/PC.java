package demo3;

public class PC {
	
	public static void main(String[] args) {
	
		System.out.println(m1());

}
	
	public static int m1() {
		try {
			//return 777;
			//System.exit(0);
		}
		
		catch(Exception e){
			return 888;
		}
		
		finally {
			return 10/0;
		}
	}
	
}