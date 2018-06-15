import java.util.Scanner;
public class Occurence {
	public static void isOccur(String str,String substr)
	{
		if(str.contains(substr)==true)
		{
			System.out.print(substr+" contain in "+str);
		}
		else
			System.out.print(substr+" doesnot contain in "+str);
	}
public static void main(String[] args)
{
	String str;
	String substr;
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	substr=sc.nextLine();
	sc.close();
	isOccur(str,substr);
}
}
