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
		
		System.out.println("3���� ���� �� �߾Ӱ��� ���մϴ�.");
		
		System.out.println("a�� ���� : "); int a = sc.nextInt();
		System.out.println("b�� ���� : "); int b = sc.nextInt();
		System.out.println("c�� ���� : "); int c = sc.nextInt();
		
		System.out.println(mid3(a, b, c));

	}
	
}
