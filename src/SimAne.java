import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SimAne {

    public static void testCase(){
        ArrayList<Branch> list = new PathRead().read("Triangle.path");
        System.out.println(list);
        Object[] arr = list.toArray();

        Random rd = new Random();
        int rda = rd.nextInt();
        int rdb = rd.nextInt();
        int rdc = rd.nextInt();

        Triangle.newTrace();
        Triangle.checkTriangle(rda, rdb, rdc);
        System.out.println(Triangle.getTrace());

        






    }



}
