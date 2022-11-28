package in.co.rays;

public class TestAccount {
public static void main (String[]args) {
	
	Account obj = new Account ();
	
	obj.setnumber("123456547");
	obj.settype("Saving");
	obj.setbalance(1254448.2);
	
	String number = obj.getnumber();
	System.out.println("Account number " + number);
	
	String type = obj.gettype();
	System.out.println("Accpunt type " + type);
	
	double balance = obj.getbalance();
	System.out.println("Remainig balance " + balance);
	
}
}
