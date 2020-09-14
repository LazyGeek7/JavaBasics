package demo1;

public class SwitchFallthroughDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='u';
		switch(ch) {
		case 'a' : System.out.println("vowel");
		break;
		case 'e' : System.out.println("vowel");
		break;
		case 'i' : System.out.println("vowel");
		break;
		case 'o' : System.out.println("vowel");
		break;
		case 'u' : System.out.println("vowel");
		default : System.out.println("Fall thorugh");
		}

	}

}
