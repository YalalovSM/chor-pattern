package ru.sydev;

import java.util.Arrays;
import java.util.List;

public class VowelsHandler extends Handler {
    private final static int NUM_OF_VOWELS = 9;
    private final static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    @Override
    public boolean check(String str) {
        final boolean result = str.chars().mapToObj(c -> (char)c).filter(vowels::contains).count() <= NUM_OF_VOWELS;

        return result && checkNext(str);
    }
}
