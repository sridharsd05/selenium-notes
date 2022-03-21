package A1_VariableFinal;

public class Variable {

	public static void main(String[] args) {
		final int i=1;
		i=i+1;
		System.out.println(i);//2 
	}
	final public static void add()
	{
		System.out.println("add from function 1");
	}
	public static void sub()
	{
		System.out.println("sub from function 1");
	}
}
