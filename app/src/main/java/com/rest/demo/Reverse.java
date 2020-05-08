package com.rest.demo;

public class Reverse {
    
    private String string = "";

    /* When controller calls the constructor with a string input, it calls the setContent method with the string
    *  to reverse the string. The set value for the string field for Reverse object would be the reverse of the input.
    */
    public Reverse(String string) {
        this.string = setContent(string);
    }
    
    // Setter
    public String setContent(String str) {

        char[] oldString = str.toCharArray();
        char[] newString = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            newString[i] = oldString[(str.length() - 1) - i];
        }

        string = String.valueOf(newString);

        return string;
    }

    // Getter
    public String getContent() {
        return this.string;
    }
}