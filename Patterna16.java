package patterns;

import java.util.Scanner;

public class Patterna16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(x++);
			}
			x=x-2;
			for(int j=i-1;j>0;j--)
			{
				System.out.print(x);
				x=x-1;
			}
			System.out.println();
			sc.close();
		}
	}


	}
