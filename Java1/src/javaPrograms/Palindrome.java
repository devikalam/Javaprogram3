package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {

		int n=121,rev=0,temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
