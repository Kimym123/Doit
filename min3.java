package Chap01;

import java.util.Scanner;

public class min3 {
	public static int min3(int a, int b, int c){
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3���� ���� �� �ּҰ��� ���մϴ�.");
		
		System.out.println("a�� ���� : "); int a = sc.nextInt();
		System.out.println("b�� ���� : "); int b = sc.nextInt();
		System.out.println("c�� ���� : "); int c = sc.nextInt();
		
		System.out.println(min3(a, b, c));

	}
	
	
}
