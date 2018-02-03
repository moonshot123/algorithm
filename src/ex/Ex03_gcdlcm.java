package ex;

import java.util.Scanner;

public class Ex03_gcdlcm {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int gcd = 0;
		int lcm = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째숫자를 입력하세요.");
		a = sc.nextInt(); 
		
		System.out.println("두번째 숫자를 입력하세요.");
		b= sc.nextInt();
		
		if(a<=b){
		
			while( a <= b){
				
				if(b%a==0){
					gcd = a;
					break;
				}				
				a--;
			}
		}else{
			while( b <= a){
				
				if(a%b==0){
					gcd = b;
					break;
				}				
				b--;
			}			
		}
		
		lcm = a*b/gcd;
			
		System.out.println("최대공약수는"+ gcd +"입니다.");
		
		System.out.println("최소공배수는"+ lcm +"입니다.");
		sc.close();
	}
	
}
