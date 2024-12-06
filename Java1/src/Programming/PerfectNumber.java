package Programming;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=8;int sum=0;
	for(int i=1;i<=n-1;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
	}
	if(n==sum) {
		System.out.println("perfect no");
	}
	else {
		System.out.println("not a perfect no");
	}
	}

}
