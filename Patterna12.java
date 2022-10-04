package patterns;

import java.util.Scanner;

public class Patterna12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		char ch=(char)('A'+x);
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch=(char)(ch+1);
			}
			System.out.println();
		}
		sc.close();

	}

}
