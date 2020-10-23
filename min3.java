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
		
		System.out.println("3개의 정수 중 최소값을 구합니다.");
		
		System.out.println("a의 값은 : "); int a = sc.nextInt();
		System.out.println("b의 값은 : "); int b = sc.nextInt();
		System.out.println("c의 값은 : "); int c = sc.nextInt();
		
		System.out.println(min3(a, b, c));

	}
	
	
}
