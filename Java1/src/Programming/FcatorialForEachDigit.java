package Programming;

public class FcatorialForEachDigit {

	public static void main(String[] args) {
	
		int n=245;int fact=1;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			for(int i=1;i<n;i++) {
				fact=fact*i;
				               }
			System.out.println(fact);
		
		             }

	}

}
