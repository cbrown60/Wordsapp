package com.codeclan.wordsapp;

import java.util.*;

public class Word {

    private ArrayList<String>words;
    public Word (){
        words = new ArrayList<String>();
        setupWords();

    }

    public Word(ArrayList<String>someWords){
        words = new ArrayList<String>(someWords);
    }

    public void add(String word){
        words.add(word);
    }

    private void setupWords(){
        String[] wordsToAdd = {
            "Hi",
            "Hi",
            "My",
            "Bye",
            "Lie",
            "Rye"

        };

        for(String word : wordsToAdd){
            add(word);
        }
    }


    public int getLength(){
        return words.size();
    }

//    public int howManyWords(){
//        int totalWords = words.getLength;
//        return totalWords;
//    };
//


//    public String getWords() {
//        return words;
//    }
//
//    public void setWords(String[] words) {
//        this.words = words;
//    }


}
