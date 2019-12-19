import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class PathRead {
    public ArrayList<Branch> read(String Triangle) {
        ArrayList<Branch> branch = new ArrayList<>();
        ArrayList<String> path = new ArrayList<>();
        try {
            File pathInFile = new File(Triangle);
            Scanner reader = new Scanner(pathInFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                ArrayList<Integer> nodeData = trans(data.split(":|\\s+"));
                Branch b = arrayToBranch(nodeData);
                branch.add(b);
                path.add(data);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return branch;
    }

    public ArrayList<Integer> trans(String[] arr) {
        ArrayList<Integer> trans_result = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals(" ")) {
                continue;
            }
            if (arr[i].equals("")){
                continue;
            }
            trans_result.add(Integer.parseInt(arr[i]));
        }
        return trans_result;
    };

    public Branch arrayToBranch(ArrayList<Integer> arr) {
        Branch branch = new Branch();
        for (Integer integer : arr) {
            Node node = new Node(integer);
            branch.add(node);
        }
        return branch;
    }

}