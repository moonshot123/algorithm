package ex;

import java.util.Scanner;

public class Ex02_cal {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("�������α׷��Դϴ�.");
		System.out.println("ù��° ���ڸ� �Է����ּ���:");
			a= sc.nextInt();
		System.out.println("ù��° ���ڸ� �Է����ּ���:");
			b= sc.nextInt();
		System.out.println("�μ����� ���� ����"+(a*b)+"�Դϴ�");
		
		sc.close();
	}

}
