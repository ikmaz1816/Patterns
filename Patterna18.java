package patterns;

import java.util.Scanner;

public class Patterna18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n+1;
		int n2=n;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
					System.out.print("*" +" ");
				else
				{
					if(i>j)
						System.out.print(j-1+" ");
					else
						System.out.print(2*i-1-j+" ");
				}
			}
			System.out.println();
		}
		for(int i=n2;i>=0;i--)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
					System.out.print("*" +" ");
				else
				{
					if(i>j)
						System.out.print(j-1+" ");
					else
						System.out.print(2*i-1-j+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
