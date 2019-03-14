import java.io.*;
import java.util.Scanner;
public class Qno:2
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0){
		    System.out.println("Even");
		}
		else if(num%2>0){
		    System.out.println("Invalid");
		}
		else if(num%2!=0){
		    System.out.println("Odd");
		}
		else if(num==0){
		    System.out.println("Zero");
		}
	}
}
