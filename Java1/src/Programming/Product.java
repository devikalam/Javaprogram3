package Programming;

public class Product {

	public static void main(String[] args) {
 int product=1;
 int n=133;
 while(n>0) {
	int rem=n%10;
	product=product*rem;
	n=n/10;
 }
System.out.println("product is:"+product);
	}

}
