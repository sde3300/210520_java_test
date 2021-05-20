package test0520;

public class Grade {
	   private int math;
	   private int science;
	   private int english;
	   Grade(int math, int science, int english) {
	      this.math = math;
	      this.science = science;
	      this.english = english;
	   }
	   public int average() {
	      return (math + science + english) / 3;
	   }
	   
	   public String score() {
		   	String grade;
		if (average()>=90) {
				grade = "A";
			} 
			else if (average()>=80)
			{
				grade = "B";
			}
			else if (average()>=70)
			{
				grade = "C";
			}
			else if (average()>=60)
			{
				grade = "D";
			}
			else 
			{
				grade = "F";
			}
		   return grade;
	   }
}

