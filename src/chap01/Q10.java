package chap01;
//�� ���� a,b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
//		int b = 0;
		
/*		do {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.println("b�� �� : ");
			b = stdIn.nextInt();
		}while (b<=a);*/
		while(b<=a) {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.println("b�� �� : ");
			b = stdIn.nextInt();
		}
		
		System.out.println("b-a��" + (b-a) + "�Դϴ�.");
		
	}

}