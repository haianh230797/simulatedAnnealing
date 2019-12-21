import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SimAne {

    public static void testCase() {
        ArrayList<Branch> list = new PathRead().read("Triangle.path");
        System.out.println(list);

        Random rd = new Random();
        int rda = rd.nextInt();
        int rdb = rd.nextInt();
        int rdc = rd.nextInt();

        Object[] arr = list.toArray(); //convert to array
        for (int i = 0; i < arr.length; i++) {
            int fitnessValueTargetBranch = arr[i].toString().length();  //length of element in 1 path
//            System.out.println(arr[i]);
//            System.out.println(fitnessValueTargetBranch);
            int T = 0;
            T = 0;
            while (T < 1000) {
                rda = rd.nextInt(10);
                rdb = rd.nextInt(10);
                rdc = rd.nextInt(10);
                Triangle.newTrace();
                Triangle.checkTriangle(rda, rdb, rdc);

                StringBuilder sb = new StringBuilder();
                for (Object obj : Triangle.getTrace()) {
                    sb.append(obj.toString());
                }



                String str1 = arr[i].toString();
                String str2 = sb.toString();
                String str11 = "";
                String str12 = "";
                char[] ch1 = str1.toCharArray();
                char[] ch2 = str2.toCharArray();
                int count = 0;
                for(int j=0; j<ch1.length; j++)
                {
                    if(!str11.contains(ch1[j]+""))
                    {
                        str11 += ch1[j];
                    }
                }
                for(int j=0; j<ch2.length; j++)
                {
                    if(!str12.contains(ch2[j]+""))
                    {
                        str12 += ch2[j];
                    }
                }
                char[] ch11 = str11.toCharArray();
                char[] ch12 = str12.toCharArray();
                for(int j=0; j<ch11.length; j++)
                {
                    for(int k=0; k<ch12.length; k++)
                    {
                        if(ch11[j] == ch12[k])
                        {
                            count++;
                        }
                    }
                }
                if(count == fitnessValueTargetBranch ){
                    System.out.println("test case cua path " + arr[i] + " la: " + rda+ "  " + rdb+ "  " +rdc+ "  "  );
                break;
                }

                T++;
            }
        }


//        for( Branch path : list){
//
//            int T=0;
//            T = 0;
//            while( T <=10){
//                int fitnessValueTargetBranch = String.valueOf(path).length(); //length of path
//                rda = rd.nextInt();
//                rdb = rd.nextInt();
//                rdc = rd.nextInt();
//
//
//            Triangle.newTrace();
//            Triangle.checkTriangle(rda,rdb,rdc);
//
////            int fitnessValueChromosomeBranch = Triangle.getTrace().size();
//
//            String s1 = path.toString();
//            String[] words=s1.split("");
//            int fitnessValueChromosomeBranch =0;
//
//            for(int i=0; i<words.length;i++) {
//
//                Object[] arr2 = Triangle.getTrace().toArray();
//                for (int j = 0; j <= arr2.length; j++) {
//
//                    if (arr2[j] == words[i]) {
//
//                        fitnessValueChromosomeBranch++;
//                        break;
//                    }
//                    if (arr2[j] != words[i]) {
//                        break;
//                    }
//                }
//
//            }
//            if(fitnessValueTargetBranch == fitnessValueChromosomeBranch || fitnessValueTargetBranch< fitnessValueChromosomeBranch ){
//                System.out.println("test case cua path " + path+ " la " + rda+ "  " + rdb+ "  " +rdc+ "  "  );
//                break;
//            }
//            T++;
//        }
//        }

    }

}


