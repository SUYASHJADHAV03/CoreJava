//Deep cloning using two classes customer and bank
package cloning;

public class Customer implements Cloneable{

	public String name = null;
	public BankAccount account = null;
	
	public Customer (String n) {
		
		name = n;
		
		account = new BankAccount (5400);
		
	}
	public Object clone()throws CloneNotSupportedException{
		
		Customer c = (Customer)super.clone();
		
		c.account = (BankAccount)account.clone();
		
		return c;
	}
	public static void main (String[]args)throws CloneNotSupportedException{
		
		Customer c1 = new Customer ("abc");
		Customer c2 = (Customer)c1.clone();
		
		System.out.println(c2.name);
		System.out.println(c2. account.balance);
		
		c2.name="xyz";
		c2.account.balance = 6500;
		
		//Original 
		
		System.out.println("name:"+ c1 .name);
		System.out.println("balance:"+ c1 . account.balance );
		
		//After cloning
		
		System.out.println("name:"+ c2.name);
		System.out.println("balance:"+ c2.account.balance);
		
	}
}
