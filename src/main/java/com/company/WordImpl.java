package com.company;

public class WordImpl implements Word{
    private String word;
    private int count;

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public WordImpl(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
