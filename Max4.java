package Chap01;

import java.util.Scanner;


public class Max4 {
	
	public static int Max4(int a, int b, int c, int d){
		int max = a;
		if (b>max) max=b;
		if (c>max) max=c;
		if (d>max) max=d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 4�� �� �ִ밪�� ���մϴ�.");
		
		System.out.println("a�� ���� : "); int a=sc.nextInt();
		System.out.println("b�� ���� : "); int b=sc.nextInt();
		System.out.println("c�� ���� : "); int c=sc.nextInt();
		System.out.println("d�� ���� : "); int d=sc.nextInt();
		
		
		System.out.println(Max4(a,b,c,d));
		
	}

}
