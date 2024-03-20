package src.basics_02;

public class lab025 {

    public static void main(String[] args) {
        int a=67;
        boolean b=(!(a>20 || a<78));
        System.out.println(b);

        boolean c=(!(a>20 && a<78));
        System.out.println(c);

    }
}
