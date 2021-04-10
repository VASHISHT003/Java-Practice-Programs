package Basic;

import java.util.Scanner;

public class PrintSkippedDigits {

	public static void RecursiveCounting(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		RecursiveCounting(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		RecursiveCounting(n);
	}

}
