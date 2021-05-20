package test0520;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   
		   Grade me = new Grade(math, science, english);	
		   System.out.print("평균은 "+ me.average() + "점이고 " + me.score() + "학점입니다.");
		   
		   sc.close();
		}
}
