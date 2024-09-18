package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number");
		int n = in.nextInt();
		
	
		boolean[] seive = new boolean[n];
		int a;
		int i;
		for (i = 0; i < n; i++) {
			seive[i] = true;
		}
		for (i = 2; i < n; i++) {
	
			for (a = 2*i; a < n; a+=i ) {
				seive[a] = false;
		}
		if (seive[i]!=false) {
			System.out.print(i + " ");
		}
		}

	}
}


