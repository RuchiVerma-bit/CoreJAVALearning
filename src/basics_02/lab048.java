package src.basics_02;

import java.util.Scanner;

public class lab048 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a & b");
        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a>b){
            System.out.println("Max--> "+a);
        }
        else{
            System.out.println("Max--> "+b);
        }

        }

}
