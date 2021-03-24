package firsthelp;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		System.out.println("정수값을 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0;
		int i;

		for (i = 1 ; i <= n ; i++) {
			sum = sum + (1/(double)i);
			if (i == 1)
				System.out.print("1/1 + ");
			else if (i == n) {
				System.out.println("1/" + i);
				System.out.println("");
			}
			else
				System.out.print("1/" + i + " + ");
		}
		
		System.out.print(" = " + sum);
		
		sc.close();
	}
}
