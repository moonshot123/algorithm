package ex;

import java.util.Scanner;

public class Ex04_Calculator {

	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		String c = "";
		double d=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기입니다.");
		System.out.println("숫자를 입력해주세요.");
		a= sc.nextDouble();
				
		System.out.println("계산을선택해주세요. 더하기:+ 곱하기:* 빼기:- 나누기:/");
		c = sc.next();
		
		System.out.println("두번째 숫자를 입력해주세요.");
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
		System.out.println( d +"입니다.");
		
		sc.close();
	}

}
