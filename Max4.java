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
		
		System.out.println("정수 4개 중 최대값을 구합니다.");
		
		System.out.println("a의 값은 : "); int a=sc.nextInt();
		System.out.println("b의 값은 : "); int b=sc.nextInt();
		System.out.println("c의 값은 : "); int c=sc.nextInt();
		System.out.println("d의 값은 : "); int d=sc.nextInt();
		
		
		System.out.println(Max4(a,b,c,d));
		
	}

}
