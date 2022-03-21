package A4_Encapsulation;

public class GpayMobile {

	public static void main(String[] args) {
		Banktest b= new Banktest();
		b.setMobilenumber(123456);
		if(b.getMobilenumber())
		{
			System.out.println("Mobile number validated");
		}
		else
		{
			System.out.println("mobile number is invalid");
		}
	}

}
