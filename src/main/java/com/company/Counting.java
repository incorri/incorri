package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Counting {
    public Collection<WordImpl> counting(Collection<String> words) {
        Collection<WordImpl> items = new ArrayList<>();
        for (String newWord : words){
            if (!"".equals(newWord.trim())) {
                boolean flag = false;
                for (WordImpl word: items) {
                    if (word.getWord().equalsIgnoreCase(newWord)) {
                        word.setCount(word.getCount() + 1);
                        flag = true;
                    }
                }
                if (!flag){
                    WordImpl word = new WordImpl(newWord.trim(), 1);
                    items.add(word);
                }
            }
        }
        return items;
    }
}
