package com.company;

import org.jsoup.nodes.Document;

public class GetTextSite {

    public StringBuilder getTextSite(Document doc) {
        return new StringBuilder(doc.select("body").text());
    }
}
