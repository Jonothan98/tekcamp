package com.teksystems.bootcamp.java_exercises.findCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharFinder {

    public static HashMap<Character, List<Integer>> findMatchPositions (String charsToFind, String stringToSearch){

        HashMap<Character, List<Integer>> chars = new HashMap<>();

        for(int i = 0; i < charsToFind.length(); i++){
            chars.put(charsToFind.charAt(i), new ArrayList<Integer>());
        }

        for(int i =0; i < stringToSearch.length();i++){

            if(chars.containsKey(stringToSearch.charAt(i))){
                chars.get(stringToSearch.charAt(i)).add(i);
            }
        }

        return chars;
    }
}
