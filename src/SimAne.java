import java.util.ArrayList;
import java.util.Random;

public class SimAne {

    public static void testCase() {
        ArrayList<Branch> list = new PathRead().read("Triangle.path");
        System.out.println(list);

        Random rd = new Random();
        int rda;
        int rdb;
        int rdc;

        Object[] arr = list.toArray(); //convert to array
        for (Object o : arr) {
            int fitnessValueTargetBranch = o.toString().length();  //length of element in 1 path

            int T;
            T = 0;
            while (T < 1000) {
                rda = rd.nextInt(10000);
                rdb = rd.nextInt(10000);
                rdc = rd.nextInt(10000);
                Triangle.newTrace();
                Triangle.checkTriangle(rda, rdb, rdc);

                StringBuilder sb = new StringBuilder();
                for (Object obj : Triangle.getTrace()) {



                    sb.append(obj.toString());
                }


                String str1 = o.toString();
                String str2 = sb.toString();
                StringBuilder str11 = new StringBuilder();
                StringBuilder str12 = new StringBuilder();
                char[] ch1 = str1.toCharArray();
                char[] ch2 = str2.toCharArray();
                int count = 0;
                for (char item : ch1) {
                    if (!str11.toString().contains(item + "")) {
                        str11.append(item);
                    }
                }
                for (char value : ch2) {
                    if (!str12.toString().contains(value + "")) {
                        str12.append(value);
                    }
                }
                char[] ch11 = str11.toString().toCharArray();
                char[] ch12 = str12.toString().toCharArray();
                for (char value : ch11) {
                    for (char c : ch12) {
                        if (value == c) {
                            count++;
                        }
                    }
                }
                if (count == fitnessValueTargetBranch) {
                    System.out.println("test case cua path " + o + " la: " + rda + "  " + rdb + "  " + rdc + "  ");
                    break;
                }
                int temp = 0;
                int tempa;
                int tempb;
                int tempc;
                int Freeze = 5;
                if(count < fitnessValueTargetBranch){
                    if(count > temp){
                        temp = count;
                        tempa = rda;
                        tempb = rdb;
                        tempc = rdc;
                        continue;
                    }
                    if(count < temp ){
                        if(Freeze == 0){
                            continue;
                        }
                        temp = count;
                        tempa = rda;
                        tempb = rdb;
                        tempc = rdc;
                        Freeze--;
                        continue;
                    }

                }

                T++;
                if(T==999 && count < fitnessValueTargetBranch ){
                    System.out.println("test case cua path " + o + " la: " + rda + "  " + rdb + "  " + rdc + "  ");

                }
            }
        }
    }
}


