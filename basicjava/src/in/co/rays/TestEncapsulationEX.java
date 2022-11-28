package in.co.rays;

public class TestEncapsulationEX {
public static void main(String[]args) {
	
	EncapsulationEX en = new EncapsulationEX();
	
	en.setfname("Ram");
	en.setlname("abc");
	en.setid(1);
	
	String fname = en.getfname();
	System.out.println(fname);
	
	String lname = en.getlname();
	System.out.println(lname);
	
	int id = en.getid();
	System.out.println(id);
	
	
}

}
