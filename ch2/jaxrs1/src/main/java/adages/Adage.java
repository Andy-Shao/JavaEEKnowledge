package adages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "adage")
public class Adage {
    protected int wordCount;
    protected String words;

    public Adage() {
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public String getWords() {
        return this.words;
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
        return this.words + " -- " + this.wordCount + " words";
    }
}
