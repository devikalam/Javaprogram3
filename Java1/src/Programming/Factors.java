package Programming;

public class Factors {

	public static void main(String[] args) {
		int n=6;int sum=0;int product=1;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
				product=product*i;
			}
			
		}
		System.out.println("sum is "+sum);
		System.out.println(product);

	}

}
