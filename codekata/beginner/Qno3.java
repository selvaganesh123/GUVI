import java.io.*;
import java.util.Scanner;
public class Qno3
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a character : ");
	        char ch=sc.next( ).charAt(0);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Vowel"); 
	}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
		System.out.println("Consonant");
		}
		else
		{
		System.out.println("invalid");
		}
	}
}
