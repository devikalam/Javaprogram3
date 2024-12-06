package javaPrograms;

public class FibonacciNth {

	public static void main(String[] args) {
		int n1=0,n2=1,range=10,sum=0;
		int target=11;
		if(target<=range) {
			for(int i=1;i<=10;i++) {
				if(target==i) {
					System.out.println(n1);
				}
				sum=n1+n2;
				n1=n2;n2=sum;
				
			}
		}
		else {
			System.out.println("target should less than range");
		}
	
	
	
	
	
	
	}

}
