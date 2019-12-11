import pathGen.PathGenerator;

public class Main {
    public static void main(String[]args){
        String target = "Triangle";
        String[] filePath = new String[2];
        filePath[0] = "-d=./out";
        filePath[1] = "src/" + target + ".oj";

        PathGenerator pathGenerator = new PathGenerator();
        pathGenerator.gen(filePath);


    }
}




