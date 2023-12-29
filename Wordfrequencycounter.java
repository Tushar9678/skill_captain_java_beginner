import java.util.*;

public class Wordfrequencycounter {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the paragraph :");
        String paragraph = in.nextLine();

        String[] words = paragraph.split("\\s+");  //split paragraph

        HashMap<String,Integer> word_freq = new HashMap<>();

        for(String word : words){
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); //remove punctuation and convert to lowercase

            if(!word.isEmpty()){
                int freq = word_freq.getOrDefault(word,0);
                word_freq.put(word, freq+1);
            }
        }

        System.out.println("Word Frequency :");

        for(Map.Entry<String, Integer> e : word_freq.entrySet()){
            String word = e.getKey();
            int freq = e.getValue();
            System.out.println(word + ": " + freq);
        }





    }
}