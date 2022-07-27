package com.bridgelabz.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
    static Set<String> set = new HashSet<>();
    //partial takes in the partial permutation of the string
    // remaining takes in the remaining part of the string
    private static void permutations(String partial,String remaining){
        //base case
        if(remaining == null){
            return;
        }
        if(remaining.length()==0){
            set.add(partial);
        }
        for (int i = 0; i < remaining.length(); i++){
            String newPermutation  = partial + remaining.charAt(i);
            String newRemaining = remaining.substring(0,i) + remaining.substring(i + 1);
            permutations(newPermutation,newRemaining);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutations("",str);
        System.out.println(Arrays.toString(set.toArray()));
    }
}
