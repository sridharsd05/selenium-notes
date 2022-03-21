package StringTest;

public class CompareTest {

	public static void main(String[] args) {
		String a="vcentry";
		String b="vcentry";
		System.out.println(a.compareTo(b)); // 0
	
		String c="Vcentry";
		System.out.println(a.compareTo(c)); // 32
		System.out.println(c.compareTo(a)); //-32
		String d="avenctry";
		System.out.println(a.compareTo(d)); // 21
	}
	}


