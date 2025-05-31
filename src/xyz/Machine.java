package xyz;

abstract class A {
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM USING JAVA WITH PHP");
	}
	
}
class Bank extends A{
	void ATM() {
		System.out.println("ATM MACHINE USING JAVA");
	}
}
public class Machine{
	public static void main(String[] args) {
		Bank b=new Bank();
		b.ATM();
		b.ATM2();
	}
}


