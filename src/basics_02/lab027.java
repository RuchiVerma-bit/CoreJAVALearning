package src.basics_02;

public class lab027 {

    public static void main(String[] args) {


        byte b=10;
        int a=b;
        //VALID Implicit Casting : done by compiler itself


        int a1 = (int)b;
        //VALID Explicit casting: done by explicitly by the programmer itself


        //Explicit Casting: Widening and Narrowing

        //Widening Casting: lower type to higher type
        byte c=19;
        int x= c;            //VALID Implicit Casting
        int x1= (int) c;    //VALID Explicit casting



        //Narrowing Casting: higher type to lower Type
        int d=300;
     //   byte y1= d;      //INVALID Implicit Casting
        byte y= (byte)d;    //Valid Explicit Casting
        System.out.println("Y:"+y);
    }
}
