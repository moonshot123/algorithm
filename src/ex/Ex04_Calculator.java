package ex;

import java.util.Scanner;

public class Ex04_Calculator {

	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		String c = "";
		double d=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Դϴ�.");
		System.out.println("���ڸ� �Է����ּ���.");
		a= sc.nextDouble();
				
		System.out.println("������������ּ���. ���ϱ�:+ ���ϱ�:* ����:- ������:/");
		c = sc.next();
		
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		b = sc.nextDouble();
		
		switch (c) {
		case "+":
			d = a+b;
			break;
		case "*":
			d = a*b;	
			break;
		case "-":
			d = a-b;
			break;
		case "/":
			d = (a/b);
			break;			
		default:
			break;
		}
		System.out.println( d +"�Դϴ�.");
		
		sc.close();
	}

}
