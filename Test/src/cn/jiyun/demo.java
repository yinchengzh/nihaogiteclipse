package cn.jiyun;

public class demo {
	
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=i ; j++) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
