package com.teksystems.bootcamp.java_exercises.findCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        CharFinder charFinder = new CharFinder();

        String charToFind;
        String stringToSearch;

        System.out.println("Input characters to search for: ");
        charToFind = myScanner.nextLine();
        System.out.println("Input string to search for those characters: ");
        stringToSearch = myScanner.nextLine();

        System.out.println(charFinder.findMatchPositions(charToFind, stringToSearch));
    }
}
