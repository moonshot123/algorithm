package ex;

import java.util.Scanner;

public class Ex02_cal {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("곱셈프로그램입니다.");
		System.out.println("첫번째 숫자를 입력해주세요:");
			a= sc.nextInt();
		System.out.println("첫번째 숫자를 입력해주세요:");
			b= sc.nextInt();
		System.out.println("두숫자의 곱의 값은"+(a*b)+"입니다");
		
		sc.close();
	}

}
