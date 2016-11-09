package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounterOps {

    int wordCount;
    String text;
    protected String[] mWords;


    public WordCounterOps() {
        String text = "";
    }

    public WordCounterOps(String text) {
        this.text = text;
        splitTextOnSpaces();
    }

    public String[] splitTextOnSpaces() {
        mWords = this.text.split(" ");
        return mWords;
    }

    public int getNumberOfWords() {
        wordCount = mWords.length;
        return wordCount;
    }

}
