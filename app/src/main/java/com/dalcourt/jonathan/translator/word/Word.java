package com.dalcourt.jonathan.translator.word;

/**
 * Creates a new object "Word" which contains a system default word, the Spanish translation, and
 * an accompanying image, if applicable.
 */

public class Word {
    private String mDefaultWord;
    private String mSpanishWord;
    private static final String NO_ALT = "";
    private String mSpanishAltTranslation = NO_ALT;

    // creates a Word constructor which accepts a default word and a Spanish translation
    public Word(String defaultTranslation, String spanishTranslation) {
        mDefaultWord = defaultTranslation;
        mSpanishWord = spanishTranslation;
    }

    // creates a Word constructor which accepts a default word, a Spanish translation, and an
    // alternate translation
    public Word(String defaultTranslation, String spanishTranslation, String spanishAltTranslation) {
        mDefaultWord = defaultTranslation;
        mSpanishWord = spanishTranslation;
        mSpanishAltTranslation = spanishAltTranslation;
    }

    // accesses default translation
    public String getMDefaultWord() {
        return mDefaultWord;
    }

    // accesses Spanish translation
    public String getMSpanishWordWord() {
        return mSpanishWord;
    }

    // accesses alternate translation
    public String getMAlternateTranslation() {
        return mSpanishAltTranslation;
    }

    // checks to see if there is an alternate translation
    public boolean hasAlt() {
        return mSpanishAltTranslation != NO_ALT;
    }
}
