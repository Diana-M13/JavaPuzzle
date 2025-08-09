package JavaPuzzle;


    public class WordCount {
    public static void main(String[] args) {

        countOfWords("Different isn't w ' rong");
    }
// Task
//    Write a method called countOfWords that takes a string and counts how many words it contains.

    public static void countOfWords(String text) {
        text = text.replaceAll("[^a-zA-Z0-9\\s']", "");
        String[] words = text.trim().split("\\s+");
        System.out.println(words.length);
    }
}


