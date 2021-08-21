package com.company;

import org.jsoup.nodes.Document;
import java.util.Collection;
import java.util.List;

public class WebParse {
    public WebParse(String  strUrl) {
            Document doc = new GetWeb().getWeb(strUrl);
            if (doc == null) return;
            StringBuilder text = new GetTextSite().getTextSite(doc);
            Collection<String> words = new ParseText().parse(text);
            List<WordImpl> wordObjects = (List<WordImpl>) new Counting().counting(words);
            new Sorting().sorting(wordObjects);
    }
}
