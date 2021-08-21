package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GetWeb {
    public Document getWeb(String  strUrl){
        try {
            return Jsoup.connect(strUrl).userAgent("Chrome/92.0.4515.131 Safari/532.5").referrer("http://www.google.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
