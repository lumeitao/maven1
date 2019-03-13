package com.ahead;
import java.util.Scanner;
public class demo1 {
	public static void main(String [] asd){
		int age=0;
		char sex;
		Scanner s=new Scanner(System.in);
		System.out.println("输入年龄");
		age=s.nextInt();
		System.out.println("输入性别");
		String sex1=s.next();
		sex=sex1.charAt(0);
		if(age>7||(age>5&&sex=='男'))
		{
			System.out.println("可以搬桌子");
			
		}
		else
		System.out.println("不能搬");
	}

}
