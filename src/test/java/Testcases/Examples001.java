package Testcases;

public class Examples001 {

	int a=10,b=20;
	
	public void sum() {
		System.out.println(a+b);
	}
	public void Sub() {
		System.out.println(b-a);
	}
	
	public void mult() {
		System.out.println(a*b);
	}
	
	public void Div() {
		System.out.println(b/a);
	}
	
	public static void main(String[] args) {
		
		Examples001  e=new Examples001 ();
		e.sum();
		e.Sub();
		e.mult();
		e.Div();
	}

}
