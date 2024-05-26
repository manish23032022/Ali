package demo;

public class B {

	{
		System.out.println("B non Static Block");
	}
	
	public static void main(String[] args) {

		System.out.println("main Method");
		A a= new A();
		//a.A;
		 B b=new B();
		
	}

}
