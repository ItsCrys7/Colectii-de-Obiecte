import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        System.out.println(containsAllVowels(str));
        input.close();
    }

    public static boolean containsAllVowels(String str) {
        HashSet<Character> foundVowels = new HashSet<Character>();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                foundVowels.add(ch);
            }
        }
        return foundVowels.size() == 5;
    }
}
