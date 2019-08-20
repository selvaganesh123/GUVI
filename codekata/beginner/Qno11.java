import java.util.Scanner;
import java.io.*;
public class Qno11{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=s.nextInt();
       System.out.println("enter the exponent:");
       int k=s.nextInt();
       int temp=1;
       for(int i=1;i<=k;i++){
           temp=temp*n;
       }System.out.println(temp);
    }
}
