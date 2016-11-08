package com.example.user.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter {

    int wordCount;
    String text;
    //protected ArrayList<String> mWords;
    protected String[] mWords;

    public WordCounter(String text) {
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
