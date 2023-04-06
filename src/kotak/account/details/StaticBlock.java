package kotak.account.details;

public class StaticBlock {
	static int accountbalance=5000;
	static{
		System.out.println("I am static block1");
	}
	static{
		System.out.println("I am static block2");
	}
	public static void main(String[] args) {
		{
				System.out.println("I am main block");
				System.out.println("your account balance is "+ accountbalance);
		}
	}

}
