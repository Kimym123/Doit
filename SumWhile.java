package Chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		int n = sc.nextInt();
		int sum=0;
		int i=0;
		
		while (i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1���� n������ ���� "+sum+"�Դϴ�.");
	}

}
