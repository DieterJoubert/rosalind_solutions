import java.util.*;
import java.io.*;

public class ProblemDNA {

    public static void main(String[] args) throws Exception{
        File file = new File("./data/rosalind_dna.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String dna = br.readLine();
        br.close();

        int[] count = countDNA(dna);

        Writer wr = new FileWriter("./out.txt");
        for (int i = 0; i < count.length; ++i) {
            String s = (new Integer(count[i])).toString();
            wr.write(s + " ");
        }
        wr.close();
    }

    public static int[] countDNA(String dna) {
        int[] count = new int[4];
        for (int i = 0; i < dna.length(); ++i) {
            char c = dna.charAt(i);

            switch (c) {
                case 'A':
                    count[0] += 1;
                    break;
                case 'C':
                    count[1] += 1;
                    break;
                case 'G':
                    count[2] += 1;
                    break;
                case 'T':
                    count[3] += 1;
                    break;
            }
        }
        return count;
    }

}