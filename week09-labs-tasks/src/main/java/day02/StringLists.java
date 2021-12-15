package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {
    List<String> shortestWords(List<String> words){
        List<String> shortestWords= new ArrayList<>();
        int minlength=Integer.MAX_VALUE;
        for(String word:words){
            if(word.length()<minlength){
                minlength=word.length();
                shortestWords.clear();
            }
            if(word.length()==minlength){
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    public static void main(String[] args) {
        StringLists stringLists=new StringLists();
        List<String> stringsListToCheck=new ArrayList<>(Arrays.asList("aaa", "aa", "bb", "cccc", "dd"));
        System.out.println(stringLists.shortestWords(stringsListToCheck));
        List<String> stringsListToCheck2=new ArrayList<>(Arrays.asList("aaa", "aa", "bb", "cccc", "dd","bármi","1"));
        System.out.println(stringLists.shortestWords(stringsListToCheck2));
    }
}
