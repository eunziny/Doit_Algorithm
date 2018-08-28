package chap01;
//n이 7이면 '1+2+3+4+5+6+7=28'로 출력
import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합 구하기");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
			
			if (i<n) {
				System.out.print(i + "+");
			}else {
				System.out.print(i);
			}
		
		}
		System.out.println("=" + sum);
		
	}

}