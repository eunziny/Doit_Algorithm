package chap01;

import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷� �ۼ�
//��)135�� �Է��ϸ� '�� ���� 3�ڸ��Դϴ�.'��� ���

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("���� �Է£�");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0;
		
		while (n > 0) {
			n /= 10;
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}

}