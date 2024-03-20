package src.basics_03;

public class lab028 {

    public static void main(String[] args) {


        int course=100;
        float GST= 0.1845f;
        float result= course+course*GST;
        int result1= (int) (course+ course*GST);
        System.out.println("Result: "+result);
        System.out.println("Result1: "+result1);

    }
}
