package net.lizheng.cheer.exercise.Subjecct02;
import java.util.Scanner;
public class Cheer03 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入；");
		int age = sc.nextInt();
		
		if(age>=60){
			System.out.println("老年人");
		}else if(age>=40&&age<60){
			System.out.println("中年人");
		}else if(age>=20&&age<40){
			System.out.println("青年人");
		}else{
			System.out.println("儿童");
		}
		
	}

}
