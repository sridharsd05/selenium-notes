package staticAndNonStatic;

public class StaticTest {

	public static void main(String[] args) {
		//sub();
		StaticTest a= new StaticTest();
		StaticTest b= new StaticTest();
		StaticTest c= new StaticTest();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//a.add();
	a.calc();
	
	}
public void add()
{
	System.out.println("add");
}
public static void sub()
{
	System.out.println("sub");
}
public void calc()
{
	add();
	sub();
}

	}


