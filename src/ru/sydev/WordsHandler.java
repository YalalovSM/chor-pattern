package ru.sydev;

public class WordsHandler extends Handler {
    private final static int NUM_OF_WORDS_IN_SENTENCE = 12;
    @Override
    public boolean check(String str) {
        String[] arr = str.split("\\b");
        final boolean result = arr.length <= NUM_OF_WORDS_IN_SENTENCE;

        return result && checkNext(str);
    }
}
