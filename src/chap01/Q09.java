package chap01;
//���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �Ʒ� �޼��� �ۼ�
//static int sumof(int a, int b)

public class Q09 {
	static int sumof(int a, int b) {
		int sum = 0;
		int min = a;
		int max = b;
		if(a>b) {
			min = b;
			max = a;
		}
		for(int i=min; i<=max; i++)
			sum+=i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
		System.out.println(sumof(6,4));
	}

}