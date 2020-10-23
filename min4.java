package Chap01;

import java.util.Scanner;

public class min4 {
	
	public static int min4(int a, int b, int c, int d){
		int min = a;
		if (b<min) min=b;
		if (c<min) min=c;
		if (d<min) min=d;
		
		return min;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4개의 정수 중 최소값을 구합니다.");
		
		System.out.println("a의 값은 : "); int a = sc.nextInt();
		System.out.println("b의 값은 : "); int b = sc.nextInt();
		System.out.println("c의 값은 : "); int c = sc.nextInt();
		System.out.println("d의 값은 : "); int d = sc.nextInt();
		
		System.out.println(min4(a,b,c,d));

	}
	
}
