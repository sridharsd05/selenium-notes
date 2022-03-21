package staticAndNonStatic;

public class CountTest {
	public int i=0;
	public static void main(String[] args) {

		CountTest c1= new CountTest();
		CountTest c2= new CountTest();
		CountTest c3= new CountTest();
		
		c1.count();
		c2.count();
		c3.count();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
public void count()
{
	i++; 
	System.out.println(i);
}
	}


