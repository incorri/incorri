package com.company;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public void sorting(List<WordImpl> wordObjects) {

        wordObjects.sort(Comparator.comparing(WordImpl::getCount));

        for (WordImpl word : wordObjects) {
            System.out.println(word.getWord() + " - " + word.getCount());
            new SaveWords(word);
        }
    }
}
