package Chap01;

import java.util.Scanner;

public class JudegeSign {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int n = sc.nextInt();
		
		if (n>0) System.out.println("양수 입니다.");
		else if (n==0) System.out.println("0입니다.");
		else System.out.println("음수 입니다.");
	}

}
