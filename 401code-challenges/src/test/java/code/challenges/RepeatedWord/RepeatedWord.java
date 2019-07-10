package code.challenges.RepeatedWord;

import java.util.HashSet;

public class RepeatedWord {

    public static String findRepeatedWord(String input){
        HashSet<String> set = new HashSet<>();
        String[] words = input.split("[ .,?!]+");
        for (String word : words){
            if (set.contains(word)){
                return word;
            }else set.add(word);
        }
        return "Not found.";
    }
}
