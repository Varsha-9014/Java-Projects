package xyz;
interface message{
	void say();
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message ob = () -> System.out.println("this is lambda expression");
		ob.say();

	}

}



