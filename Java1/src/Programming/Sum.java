package Programming;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		for(int n=5678;n>0;n=n/10) {
			int rem=n%10;
			sum=sum+rem;
		}
		System.out.println("sum is:"+sum);

	}

}
