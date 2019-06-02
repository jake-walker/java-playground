public class WordsInSentence {
  public static int CountWordsInSentence(String sentence) {
    String[] words = sentence.split(" ");
    return words.length;
  }

  public static void main(String[] args) {
    String sentence = "The quick brown fox jumped over the lazy dog";
    int words = CountWordsInSentence(sentence);
    System.out.println("There are " + words + " words in the sentence '" + sentence + "'!");
  }
}