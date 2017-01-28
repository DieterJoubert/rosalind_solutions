import java.util.*;
import java.io.*;

public class ProblemPROT {
    public static HashMap<String,Character> codonTable = new HashMap<>();

    public static void main(String[] args) throws Exception {
        File file = new File("./data/rosalind_prot.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String rna = br.readLine();
        br.close();

        initializeCodonTable();
        String protein = translateRnaIntoProtein(rna);

        Writer wr = new FileWriter("./out.txt");
        wr.write(protein);
        wr.close();
    }

    public static String translateRnaIntoProtein(String rna) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rna.length()-3; i += 3) {
            String codon = rna.substring(i,i+3);
            if (codonTable.get(codon) != '\0') {
                sb.append(codonTable.get(codon));
            }
            else {
                break;
            }
        }
        return sb.toString();
    }

    public static void initializeCodonTable() throws Exception {
        File file = new File("./data/rna_codon_table.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String contentLine;

        while ((contentLine = br.readLine()) != null) {
            String[] lineArray = contentLine.split("\\s+");
            String codon = lineArray[0];
            String protein = lineArray[1];

            if (protein.equals("Stop")) {
                codonTable.put(codon,'\0');
            }
            else {
                char c = protein.charAt(0);
                codonTable.put(codon, c);
            }
        }
    }

    public static void printCodonTable() {
        for (String name: codonTable.keySet()){
            String key = name.toString();
            String value = codonTable.get(name).toString();  
            System.out.println(key + " " + value);
        } 
    }
}