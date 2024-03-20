package src.basics_02;

public class lab033 {

    public static void main(String[] args) {

        String name="Ruchi Verma";   //Stored in SCP or OA: SCP
        String name1= "Ruchi Verma";
        String name2= new String("Ruchi Verma");
        String name3= new String("Ruchi verma");

        //only 2 string are created
        // Name String is created and name1 is using reference of name string
        //second string is created in OA area, name2

        System.out.println("name==name1");
        System.out.println(name==name1);
        System.out.println("name==name2");
        System.out.println(name==name2);
        System.out.println("name1==name2");
        System.out.println(name1==name2);
        System.out.println("name.equals(name1)");
        System.out.println(name.equals(name1));
        System.out.println("name.equals(name2)");
        System.out.println(name.equals(name2));
        System.out.println("name.equals(name3)");
        System.out.println(name.equals(name3));     //Verma  verma




    }
}
