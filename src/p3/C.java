package p3;

public class C extends B{

	@Override
	public void test1() {
		System.out.println("Prajakta");
		
	}

	@Override
	public void test2() {
		System.out.println("Sakore");
		
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		
		c1.test1();
		c1.test2();
	}
	

}
