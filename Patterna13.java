package patterns;

import java.util.Scanner;

public class Patterna13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=n-1;i>=0;i--)
		{
			char ch=(char)('A'+i);
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(ch+" ");
				ch=(char)(ch+1);
			}
			System.out.println();
		}
		sc.close();

	}

}
