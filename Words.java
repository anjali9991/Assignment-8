import java.util.Scanner;
public class Words {
public static int noOfWords(String s)
{
	int i=0,count=0;
	while(i<s.length())
	{
		if(s.charAt(i)==32)
		{
			count++;
		}
		i++;
	}
	return count+1;
}
public static void main(String[] args)
{
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	sc.close();
	int length;
	length=noOfWords(s);
	System.out.print("No of words are "+length);
}
}
