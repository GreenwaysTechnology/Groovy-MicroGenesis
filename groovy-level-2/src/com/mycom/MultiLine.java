package com.mycom;

public class MultiLine {
    public static void main(String[] args) {
        String title = "Micro";
        String doc = "<html>" +
                "<head>" +
                "<title>" + title + "</title>" +
                "<body>" +
                "<h1> Hello</h1>" +
                "</body>" +
                "</body></html>";
        System.out.println(doc);

    }
}
