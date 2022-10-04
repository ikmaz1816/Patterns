package patterns;

import java.util.Scanner;

public class Patterna17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n/2+1;
		int n2=n/2;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n1-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
		for(int i=n2;i>0;i--)
		{
			for(int j=1;j<=(n2+1)-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}

	}
}
