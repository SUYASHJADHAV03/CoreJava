package in.co.rays;

public class sumofintss {
public static void main(String[]args) {
	
	int sum = 0 , count = 0 ;
	
for ( int i=100 ; i<200 ; i++) {
	
if (i%7==0) {
	
	sum = (sum+i);
	count++;
}
}
System.out.println("Sum of all int grater then 100 and less then 200" + sum);
}
}
