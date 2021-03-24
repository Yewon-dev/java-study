package firsthelp;

/*
 문제) 입력된 액수에 해당하는 최소 수량의 지폐와 동전 갯수 출력 
 해야할 것) 액수를 입력 -> 나머지 구하기 -> 출
*/

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int money = sc.nextInt();
		// 50000, 10000, 1000, 500, 100, 10, 1
		
		/* 65245  -----> 15245/10000 = 1 ... 5245 / 1000 = 5 ... 245
		 	=>50000 * 1 
		 	+ 10000 * 1 
		 	+ 1000 * 5 
		 	+ 500 * 0 
		 	+ 100 * 2
		 	+ 10 * 4
		 	+ 1 * 5
		*/
		int a = money / 50000;
		int b = (money % 50000) / 10000;
		int c = ((money % 50000) % 10000) / 1000;
		int d = (((money % 50000) % 10000) % 1000) / 500;
		int e = ((((money % 50000) % 10000) % 1000) % 500) / 100;
		int f = (((((money % 50000) % 10000) % 1000) % 500) % 100) / 10;
		int g = ((((((money % 50000) % 10000) % 1000) % 500) % 100) % 10) / 1;
		
		System.out.println("5만원 => " + a );
		System.out.println("1만원 => " + b );
		System.out.println("1천원 => " + c );
		System.out.println("500원 => " + d );
		System.out.println("100원 => " + e );
		System.out.println("10원 => " + f );
		System.out.println("1원 => " + g );

		
	}
}
