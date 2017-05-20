package net.lizheng.cheer.sample.ch03;

public class Conver {

	public static void main(String[] args) {
		byte  mybyte = 127;
		int myint = 150;
		//long mylong = ;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte与float的值进行运算结果为:"+(mybyte+myfloat));
		System.out.println("byte与int的值进行运算结果为:"+(mybyte*myint));
		System.out.println("byte与char的值进行运算结果为:"+(mybyte/mychar));
		System.out.println("byte与double的值进行运算结果为:"+(mybyte+mydouble));

	}

}
