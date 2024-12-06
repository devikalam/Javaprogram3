package Programming;

import java.util.Scanner;

public class CountNoOfDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
int count=0;

	for(;a>0;a=a/10){
			//int rem=a%10;
			count++;
	
}
	System.out.println("count is:"+count);
	}

}
