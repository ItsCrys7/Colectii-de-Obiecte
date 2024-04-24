import java.util.List;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapEx2 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
        List<String> lowerCaseWords = wordList.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(countWords(lowerCaseWords.toArray(new String[0])));
    }

    public static TreeMap<String, Integer> countWords(String[] words) {
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();
        for (String word : words) {
            int count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }
        return wordCountMap;
    }
}
