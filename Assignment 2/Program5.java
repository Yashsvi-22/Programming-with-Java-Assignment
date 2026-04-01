import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> wordCount = new HashMap<>();

        System.out.println("Enter a sentence:");
        String line = sc.nextLine();

        String words[] = line.toLowerCase().split(" ");

        for (String word : words) {
            if (wordCount.containsKey(word))
                wordCount.put(word, wordCount.get(word) + 1);
            else
                wordCount.put(word, 1);
        }

        System.out.println("\nWord Occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
