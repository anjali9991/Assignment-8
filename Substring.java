
import java.util.Scanner;
public class Substring {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str="xyz";
		char arr[]=str.toCharArray();
		int n;
		n=str.length();
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=0;j<=(n-i);j++)
			{
				l=i+j-1;
				for(k=j;k<=l;k++)
					System.out.print(arr[k]);
				System.out.print("\n");
			}
		}
	}
}
