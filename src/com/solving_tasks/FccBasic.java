package com.solving_tasks;

import java.util.Arrays;
import java.util.Comparator;

public class FccBasic {
    public static void main(String[] args) {
        Solutions solutions = new Solutions();

////      Confirmending. For the purpose of this challenge do not use endsWith method.
//        System.out.println(solutions.confirmEnding("Bastian", "n"));
//        System.out.println(solutions.confirmEnding("Congratulation", "on"));
//        System.out.println(solutions.confirmEnding("Connor", "n"));
//        System.out.println(solutions.confirmEnding("Abstraction", "action"));

//        // Return Largest Numbers in Arrays
//        int[] arr1 = {4, 5, 1, 3, 77, 103, 150};
//        int[] arr2 = {13, 27, 18, 26};
//        int[] arr3 = {32, 35, 37, 39};
//        int[] arr4 = {1000, 1001, 857, 1};
//        System.out.println(Arrays.toString(solutions.largestNumbersInArrays(arr1, arr2, arr3, arr4)));

//        // findLongestWord
//        System.out.println(solutions.findLongestWord("The quick brown fox jumped over the lazy dog"));

//        // factorialize
//        System.out.println(solutions.factorialize(5));

//        // reverseString
//        System.out.println(solutions.reverseString("global"));
    }
}

class Solutions {
    boolean confirmEnding(String str, String ending){
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    int[] largestNumbersInArrays(int[] ...arrayOfArrays){
        int[] largestNumsFromAllArrays = new int[arrayOfArrays.length];

        for (int i = 0; i < arrayOfArrays.length; i++) {
            largestNumsFromAllArrays[i] = Arrays.stream(arrayOfArrays[i]).max().getAsInt();
        }

        return largestNumsFromAllArrays;
    }

    String findLongestWord(String str){
        return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    long factorialize(int num){
        if(num == 1) return 1;
        return num * factorialize(--num);
    }

    String reverseString(String str){
        return new StringBuilder().append(str).reverse().toString();
    }
}
