import java.util.*;
import java.io.*;

public class ProblemREVC {

    public static void main(String[] args) throws Exception{
        File file = new File("./data/rosalind_revc.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String dna = br.readLine();
        br.close();

        String revComp = reverseComplement(dna);

        Writer wr = new FileWriter("./out.txt");
        wr.write(revComp);
        wr.close();
    }

    public static String reverseComplement(String dna) {
        String revComp = "";
        for (int i = dna.length()-1; i >= 0; --i) {
            char c = dna.charAt(i);

            switch (c) {
                case 'A':
                    revComp += 'T';
                    break;
                case 'C':
                    revComp += 'G';
                    break;
                case 'G':
                    revComp += 'C';
                    break;
                case 'T':
                    revComp += 'A';
                    break;
            }

        }
        return revComp;
    }

}