package aphorism2;

public class Adage {
    private int id;
    private int wordCount;
    private String words;

    public Adage() {
    }

    public int getId() {
        return this.id;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public String getWords() {
        return this.words;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWordCount(int wordCount) {
    }

    // properties
    public void setWords(String words) {
        this.words = words;
        this.wordCount = words.trim().split("\\s+").length;
    }

    // overrides
    @Override
    public String toString() {
        return String.format("%2d: " , this.id) + this.words + " -- " + this.wordCount + " words";
    }
}