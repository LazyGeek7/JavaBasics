package demo2;

class Account{
	
	float amount=20000;
	void display() {
		System.out.println("The balance is "+ amount);
	}
	
	void deposit(float money) {
		amount=amount+money;
	}
	
	void withdraw(float money) {
		if (amount>money) {
			amount=amount-money;
			System.out.println("Remaining balance is "+ amount);
		} 
		else {
			System.out.println("No sufficient Balance");
		}
	}
	
	
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a=new Account();
		//a.display();
		a.deposit(5000);
		a.display();
		a.withdraw(30000);
		
		
		
		

	}

}
