import java.util.Scanner;
import java.io.*;
public class Example {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        System.out.println("enter the year");
        int year=s.nextInt();
        if(year%400==0){
            System.out.println("leapyear");
        }
        else if(year%100==0){
            System.out.println("not leapyear");
        }
        else if(year%4==0){
            System.out.println("leapyear");
        }
        else{
            System.out.println("not leapyear");
        }
        
    }
    
}
