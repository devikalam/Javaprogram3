package Programming;

public class ExtractAllDigit {

	public static void main(String[] args) {
		
		for(int n=45637;n>0;n=n/10) {
			int rem =n%10;
			System.out.println(rem);
		}
		}


	}
