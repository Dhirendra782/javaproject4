package com.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCountOccurrenceUsingMap {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine().trim();
        int count;
        char [] arr = st.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            count = 0;
            for(int j=0; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(arr[i],count);
        }
        System.out.println(map);

    }

}

