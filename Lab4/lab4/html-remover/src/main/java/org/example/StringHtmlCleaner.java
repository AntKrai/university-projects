package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class StringHtmlCleaner {
    public static String clean(String args)

    {
        Document document = Jsoup.parse(args);
        return document.text();
    }
}
