import java.util.Scanner;
import java.io.*;
public class Qno5 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        if(c>d&&c>e){
            System.out.println(c+"is the greater");
        }
        else if(d>c&&d>e){
            System.out.println(d+"is the greater");
        }
        else if(e>c&&e>d){
            System.out.println(e+"is the greater");
        }
        else if(c==0&&d==0&&e==0){
            System.out.println("all number is zero");
        }
        else if(c==d&&d==e){
            System.out.println("all are same");
        }
        else{
        System.out.println("invalid");
    }
        
    }
    
}
