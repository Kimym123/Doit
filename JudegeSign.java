package Chap01;

import java.util.Scanner;

public class JudegeSign {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		
		int n = sc.nextInt();
		
		if (n>0) System.out.println("��� �Դϴ�.");
		else if (n==0) System.out.println("0�Դϴ�.");
		else System.out.println("���� �Դϴ�.");
	}

}
