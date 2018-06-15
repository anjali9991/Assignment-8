import java.util.Scanner;
public class Removevowels {
public static void main(String[] args)
{
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	sc.close();
	String result="";
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')
		{
			result+=s.charAt(i);
		}

	}
	System.out.print(result);
}
}
