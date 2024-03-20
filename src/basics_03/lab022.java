package src.basics_03;

public class lab022 {
    public static void main(String[] args) {

        boolean a=true;
        System.out.println(a);
        System.out.println(!a);
     //   System.out.println(!10);  // ! expression is allowed with boolean & with condition only
        System.out.print("!(10>20)=");
        System.out.println(!(10>20));
        System.out.print("(10>20)=");
        System.out.println(10>20);

        System.out.print("true|| true=");
        System.out.println(true|| true);
        System.out.print("false|| true=");
        System.out.println(false|| true);
        System.out.print("true|| false=");
        System.out.println(true|| false);
        System.out.print("false|| false=");
        System.out.println(false|| false);
        System.out.println("-------------------");
        System.out.print("true && true=");
        System.out.println(true && true);
        System.out.print("false && true=");
        System.out.println(false && true);
        System.out.print("true && false=");
        System.out.println(true && false);
        System.out.print("false && false=");
        System.out.println(false && false);
    }
}
