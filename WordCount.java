package JavaPuzzle;


    public class WordCount {
    public static void main(String[] args) {
        countOfWords("Different isn't w ' rong");
    }


    public static void countOfWords(String text) {
        text = text.replaceAll("[^a-zA-Z0-9\\s']", "");
        String[] words = text.trim().split("\\s+");
        System.out.println(words.length);
    }
}


