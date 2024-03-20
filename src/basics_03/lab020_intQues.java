package src.basics_03;

public class lab020_intQues {

    public static void main(String[] args) {

        //Relational Operators

        int a=10;
        int b=14;
        boolean result= a>b;
        System.out.println("Result: "+result);

        // <, > , <= ,>=, ==,!=

        int c=34;
        int d=34;
        boolean e= c==d;

        //when int it will check for the values but when it comes to
        // String it will check for the references
        System.out.println(e);
        System.out.println("-------------------");
        //interview questions
        System.out.println(10==10);
        System.out.println(10<=10);
        System.out.println(10>=10);
        System.out.println(10>10);
        System.out.println(10<10);
        System.out.println('A'==65);

        byte b1=65;
        System.out.println("---------------");
        System.out.println('A'==b);
        System.out.println("-------'A'==65.0(double)--------");
        System.out.println('A'==65.0);
        System.out.println("-------'A'==65.0f(float)--------");
        System.out.println('A'==65.0f);

        System.out.println("-------'A'==65.2(double)--------");
        System.out.println('A'==65.2);

      //  System.out.println(true==0);
       // System.out.println(true>=true);

    }
}
