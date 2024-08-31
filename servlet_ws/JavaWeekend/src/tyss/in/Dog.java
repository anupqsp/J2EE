package tyss.in;

public class Dog implements Animal {

	@Override
	public void m1() {
		System.out.println("Bow Bow");
		
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.m1();
	}

}
