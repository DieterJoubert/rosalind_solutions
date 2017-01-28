import java.util.*;
import java.io.*;

public class ProblemSUBS {

    public static void main(String[] args) throws Exception{
        File file = new File("./data/rosalind_subs.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String dna = br.readLine();
        String motif = br.readLine();
        br.close();

        System.out.println(dna);
        System.out.println(motif);

        ArrayList<Integer> locations = findMotifLocations(dna, motif);

        StringBuilder sb = new StringBuilder();
        Writer wr = new FileWriter("./out.txt");
        for (Integer loc : locations) {
            sb.append(loc.toString());
            sb.append(" ");
        }
        wr.write(sb.toString());
        wr.close();
    }

    public static ArrayList<Integer> findMotifLocations(String dna, String motif) {
        ArrayList<Integer> locations = new ArrayList<Integer>();

        for (int i = 0; i <= dna.length() - motif.length(); ++i) {
            String kmer = dna.substring(i,i+motif.length());
            if (kmer.equals(motif)) {
                locations.add(i+1);  //problem uses 1-indexing
            }

        }
        return locations;
    }

}