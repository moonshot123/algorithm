package ex;

import java.util.Scanner;

public class Ex03_gcdlcm {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int gcd = 0;
		int lcm = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��°���ڸ� �Է��ϼ���.");
		a = sc.nextInt(); 
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
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
			
		System.out.println("�ִ�������"+ gcd +"�Դϴ�.");
		
		System.out.println("�ּҰ������"+ lcm +"�Դϴ�.");
		sc.close();
	}
	
}
