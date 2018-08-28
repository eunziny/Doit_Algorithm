package chap01;
//가우스덧셈(1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있음)을 이용하여 1부터 n까지의 정수 합 구하기

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합 구하기");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = (1+n)*n/2;
		
		System.out.println("1부터" + n + "까지의 합 : " + sum);
	}

}
