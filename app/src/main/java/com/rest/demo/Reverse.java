package com.rest.demo;

public class Reverse {
    
    private String string = "";

    public Reverse(String string) {
        this.string = getContent(string);
    }
    
    public String getContent(String str) {

        char[] oldString = str.toCharArray();
        char[] newString = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            newString[i] = oldString[str.length() - i];
        }

        string = String.valueOf(newString);

        return string;
    }
}