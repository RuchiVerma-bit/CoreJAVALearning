package src.basics_03;

public class lab019 {

    public static void main(String[] args) {
        int a=10;       //Simple Assignment Operators
        int b=45;
        b+=30;          //Compound Assignment Operators  b=b+30
        System.out.println("B: "+b);

        int b1=90;
        b1-=89;         //b1=b1-89
        b1= b1+1;       //Not a Compound Assignment Operators
        System.out.println("B1: "+b1);

        int b2= 4;
        b2*=8;          //Compound Assignment Operators  b2=b2*8
        System.out.println("B2: "+b2);

        int b3=8;
        b3/=2;          //Compound Assignment Operators  b3=b3/2
        System.out.println("B3: "+b3);

        int b4=30;
        b4%=4;          //Compound Assignment Operators  b4=b4%4
        System.out.println("B4: "+b4);


        int a1= -10;            //Unary Operators
    }
}
