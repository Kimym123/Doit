package Chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n = sc.nextInt();
		int sum=0;
		int i=0;
		
		while (i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 n까지의 합은 "+sum+"입니다.");
	}

}
