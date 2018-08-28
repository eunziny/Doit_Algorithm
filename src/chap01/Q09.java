package chap01;
//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드 작성
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