package Assignment1;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=s.nextInt();
		int[] grades;
		grades=new int[n];
		int i=0;
		int sum=0;
		while(i<n)
		{
			System.out.printf("Enter the grade of student:"+(i+1));
			int g=s.nextInt();
			if((g>=0)&&(g<=100))
			{
				grades[i]=g;
				sum=sum+g;
				i++;
				continue;
				
			}
			System.out.println("invalid grade");
		}
		System.out.printf("Average:"+(sum/n));

}
}
