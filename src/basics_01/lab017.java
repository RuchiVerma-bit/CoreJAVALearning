package src.basics_01;

public class lab017 {
    public static void main(String[] args) {
        byte a=10;
        byte b=19;
       // byte c= a+b;          --byte +byte= int
        int c1= a+b;


        String firstname="Ruchi";
        String lastname="Verma";

        System.out.println(firstname+lastname);
        String fullname= firstname.concat(lastname);
        System.out.println("Full Name: "+fullname);

    }
}
