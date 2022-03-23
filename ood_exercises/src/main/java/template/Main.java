package template;

public class Main {
    public static void main(String[] args) {

        Template originalSentence = new OriginalSentence();
        Template RandomSentence = new RandomSentence();

        originalSentence.tellStory();
        RandomSentence.tellStory();
    }
}
