package Programming;

public class SpyNo {

	public static void main(String[] args) {
		int sum=0;int product=1;
		for(int n=22;n>0;n=n/10) {
			int rem=n%10;
			sum=sum+rem;
			product=product*rem;
		}
		
if(sum==product) {
	System.out.println("it is a spy no");
}
else {
	System.out.println("it is not a spy no");
}
	}

}
