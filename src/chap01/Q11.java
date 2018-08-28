package chap01;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성
//예)135를 입력하면 '그 수는 3자리입니다.'라고 출력

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("정수 입력：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0;
		
		while (n > 0) {
			n /= 10;
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
	}

}