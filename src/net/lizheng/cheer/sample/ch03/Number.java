package net.lizheng.cheer.sample.ch03;

public class Number                    //创建类
{
	public static void main(String[] agrs) //主方法
	{
		byte mybyte = 124; //声明byte型变量并赋值
		short myshort = 32564;//声明myshort型变量并赋值
		int myint = 45784651;//声明myint型变量并赋值
		long mylong = 46789451;//声明mylong型变量并赋值
		long result = mybyte+myshort+myint+mylong;//各数相加后的结果
		System.out.println("结果为:"+ result);//结果输出
	}
}
