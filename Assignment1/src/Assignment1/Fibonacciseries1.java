package Assignment1;

import java.util.Scanner;

public class Fibonacciseries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		int n,sum=0,nextTerm=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		int ft1=0,ft2=1;
		for(int i=0;i<=n;i++)
		{
			System.out.println(ft1+"");
			nextTerm=ft1+ft2;
			ft1=ft2;
			ft2=nextTerm;
			//sum=sum+nextTerm;
		}
		
		sum=sum+nextTerm;
		System.out.println("Average:"+(float)sum/n);
	}

}