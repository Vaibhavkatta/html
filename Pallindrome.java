package pallindrome;
import java.util.Scanner;
public class Pallindrome 
{
	public static void main(String[] arg)
	{
		
		String str;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String:");
		
		str=s1.nextLine();
		System.out.println(str);
		int m=str.length();
		char org[]=new char[m];
		char rev[]=new char[m];
		int i,j;
		for(i=0;i<=m-1;i++)
		{
			org[i]=str.charAt(i);
		}
		j=0;
		for(i=m-1;i>=0;i--)
		{
			rev[j]=str.charAt(j);
			j++;
		}
		int flag=1;
		for(i=0;i<=m-1;i++)
		{
		if(org[i]==rev[i])
		{
			
			continue;
		}
		else
		{
			flag=0;
			break;
		}
			
			}
		if(flag==1)
		{
			System.out.println("The String is Pallindrome");
			
		}
		else if(flag==0)
		{
			System.out.println("The String is not Pallindrome");
		}
	}

}
