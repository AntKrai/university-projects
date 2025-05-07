package org.example;

public class Application {
    public static void main(String[] args) {
            if (args.length < 1) {
                System.out.println("Please provide a URL as an argument.");
                return;
            }
            String url = args[0];
            String htmlContent = PageDownloadingUtility.download(url);
            String cleanedContent = StringHtmlCleaner.clean(htmlContent);
            System.out.println(cleanedContent);
        }
    }
