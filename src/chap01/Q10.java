package chap01;
//두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램 작성

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
//		int b = 0;
		
/*		do {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.println("b의 값 : ");
			b = stdIn.nextInt();
		}while (b<=a);*/
		while(b<=a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.println("b의 값 : ");
			b = stdIn.nextInt();
		}
		
		System.out.println("b-a는" + (b-a) + "입니다.");
		
	}

}