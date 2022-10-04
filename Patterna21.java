package patterns;

import java.util.Scanner;

public class Patterna21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max_value=2*n-1;
		int max=0;
		for(int i=1;i<=n;i++)
		{
			int max_count=1;
			max_count+=max;
			for(int j=1;j<=n;j++)
			{
				if(max_value<max_count)
					max_count=1;
				System.out.print(max_count);
				max_count+=2;
			}
			System.out.println();
			max+=2;
		}
		sc.close();
	}

}
