package com.company;

import java.util.Arrays;
import java.util.Collection;

public class ParseText {
    public Collection<String> parse(StringBuilder text){
        return Arrays.asList(text.toString().split("[ ,.!?\";:\\[\\]()\\n\\r\\t]"));
    }
}
