package StringTest;

public class EndsWithTest {

	public static void main(String[] args) {
		String a="Vcentry";
		System.out.println(a.endsWith("try"));  // true
		System.out.println(a.endsWith("cen"));  // false
		System.out.println(a.endsWith("Try"));   // false
		System.out.println(a.endsWith("sdfsdaf"));
	}

	}

