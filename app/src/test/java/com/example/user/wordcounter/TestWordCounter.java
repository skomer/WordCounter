package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 08/11/2016.
 */

public class TestWordCounter {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("Here is some text to test with.");
    }

    @Test
    public void testSplitTextReturnsArrayOfStrings() {
        assertTrue(wordCounter.splitTextOnSpaces() instanceof String[]);
    }

    @Test
    public void testWordCount() {
        assertEquals(7, wordCounter.getNumberOfWords());
    }




}
