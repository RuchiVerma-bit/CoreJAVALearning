package src.basics_03;

public class lab044 {

    public static void main(String[] args) {


        //Decrement Operator
        int b=10;
        System.out.println(--b + b++ + ++b);
        //part A: (Exp=9 , b=9 ) --b   --> o/p:9
        //Part B: (exp=9 , b= 10 ) b++  --> o/p:9
        //Part C: (exp=11 , b= 11 ) ++b  --> o/p:11
        //part A+part B +part C =9+9+11=29
        System.out.println(b);


       System.out.println(--b - b++ - ++b);
        //part A: (Exp=10 , b=10 ) --b   --> o/p:10
        //Part B: (exp=10 , b= 11 ) b++  --> o/p:10
        //Part C: (exp=12 , b= 12 ) ++b  --> o/p:12
        //part A - part B - part C =10-10-12=-12
        



        







    }
}
