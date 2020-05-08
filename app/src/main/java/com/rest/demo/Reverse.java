package com.rest.demo;

public class Reverse {
    
    private String string = "";

    public Reverse(String string) {
        this.string = setContent(string);
    }
    
    public String setContent(String str) {

        char[] oldString = str.toCharArray();
        char[] newString = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            newString[i] = oldString[(str.length() - 1) - i];
        }

        string = String.valueOf(newString);

        return string;
    }

    public String getContent() {
        return this.string;
    }
}