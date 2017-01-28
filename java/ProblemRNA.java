import java.util.*;
import java.io.*;

public class ProblemRNA {

    public static void main(String[] args) throws Exception{
        File file = new File("./data/rosalind_rna.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String dna = br.readLine();
        br.close();

        String rna = transcribeDnaToRna(dna);

        Writer wr = new FileWriter("./out.txt");
        wr.write(rna);
        wr.close();
    }

    public static String transcribeDnaToRna(String dna) {
        String rna = "";
        for (int i = 0; i < dna.length(); ++i) {
            char c = dna.charAt(i);

            if (c == 'T') {
                rna += 'U';
            }
            else {
                rna += c;
            }

        }
        return rna;
    }

}