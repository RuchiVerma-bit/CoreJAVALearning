package src.basics_02;

public class lab038 {

    public static void main(String[] args) {

        //Ternary Operator

        //int a= if condition is true then print this : else do this
            // condition ? true: false
        
        int a=10;
        int b=20;
        int c=30;
        //find max out of three numbers
        //a>b && a>c----> then a is max


      int result1= a>b? ((a>c) ? a:c):((b>c)?b:c);
        System.out.println("Result: "+result1);




        







    }
}
