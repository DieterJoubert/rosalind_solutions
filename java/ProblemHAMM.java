import java.util.*;
import java.io.*;

public class ProblemHAMM {

    public static void main(String[] args) throws Exception {
        File file = new File("./data/rosalind_hamm.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();
        String t = br.readLine();
        br.close();

        int hamm = hammingDistance(s,t);

        Writer wr = new FileWriter("./out.txt");
        for (int i = 0; i < count.length; i++) {
            String s 
        }
        wr.write((new Integer(hamm)).toString());
        wr.close();
    }

    public static int hammingDistance(String s, String t) {
        int count = 0;

        //throw exception if length not equal

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count += 1;
            }
        }

        return count;
    }

}