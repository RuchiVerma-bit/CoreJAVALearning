package src.basics_03;

public class lab029 {

    public static void main(String[] args) {


       String s1="Ruchi";
       String s2= new String("Ruchi");

        System.out.println("s1==s2-----> "+(s1==s2));
        System.out.println("s1.equals(s2)-----> "+(s1.equals(s2)));

        System.out.println(new String("Ruchi"));

        String s3= new String("Ruchi");

        System.out.println("s2==s3-----> "+(s2==s3));
        System.out.println("s2.equals(s3)-----> "+(s2.equals(s3)));

       //String Constant Pool
    }
}
