package in.co.rays;

public class Testperson {
public static void main(String[]args) {
	
	Person p=new Person();
	
	p.setfname("Suyash");
	p.setlname("Jadhav");
	p.setadd("89,hemu colony");
	p.setage("age=25");
	
	String fname = p.getfname();
	System.out.println(fname);
	
	String lname = p.getlname();
	System.out.println(lname);
	
	String age =  p.getage();
	System.out.println(age);
	
	String add = p.getadd();
			System.out.println(add);
	
	
}
}
