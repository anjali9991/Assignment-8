import java.util.Scanner;
public class Reverse {
public static void main(String[] args)
{
	String str;
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	sc.close();
	String str1=" ";
	String string=" ";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			string=str1+" "+string;
			str1=" ";
		}
		else
		str1+=str.charAt(i);
	}
		string=str1+" "+string;
	System.out.print("Reverse string is "+string);
}
}
