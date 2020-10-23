package Chap01;

import java.util.Scanner;

public class median {
	
	static int mid3(int a, int b, int c) {
		if(a>=b) {
			if (b>=c) return b;
			else if (a<=c) return a;
			else return c;
		}
		
		else if (a>c) return a;
		else if (b>c) return c;
		else return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수 중 중앙값을 구합니다.");
		
		System.out.println("a의 값은 : "); int a = sc.nextInt();
		System.out.println("b의 값은 : "); int b = sc.nextInt();
		System.out.println("c의 값은 : "); int c = sc.nextInt();
		
		System.out.println(mid3(a, b, c));

	}
	
}
