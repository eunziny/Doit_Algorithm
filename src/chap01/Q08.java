package chap01;
//���콺����(1���� 10������ ���� (1+10)*5�� ���� ������� ���� �� ����)�� �̿��Ͽ� 1���� n������ ���� �� ���ϱ�

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ �� ���ϱ�");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = (1+n)*n/2;
		
		System.out.println("1����" + n + "������ �� : " + sum);
	}

}
