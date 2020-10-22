package Doit;

import java.util.Scanner;

public class Num3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		


		
		System.out.println("a의 값은 : ");	int a = stdIn.nextInt();
		System.out.println("b의 값은 : ");	int b = stdIn.nextInt();
		System.out.println("c의 값은 : ");	int c = stdIn.nextInt();

		int max = a;
		
		if (b>max) max = b;
		if (c>max) max = c;

		System.out.println("최대값은"+max+"입니다.");
	}

}
