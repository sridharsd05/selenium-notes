package A4_Encapsulation;

public class Gpay {
public static void main(String[] args) throws InterruptedException {
		
		Encap e = new Encap();
		e.setUsername("vcentry");
		System.out.println("yes customer name exists : "+e.getUsername());
		e.setProcessingamount(100);
		System.out.println("your request detection "+e.getProcessingamount());

	}

}
