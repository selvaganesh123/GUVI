import java.util.Scanner;
import java.io.*;
public class Qno10 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=s.nextInt();
       int total=0;
       while(n>0){
           n=n/10;
           total=total+1;
       }System.out.println("total number is "+total);
    }
    
}
